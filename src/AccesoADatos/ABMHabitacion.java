package AccesoADatos;

import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ABMHabitacion {

    private Connection conn = null;

    public ABMHabitacion() {
        conn = Conexion.getConexion();
    }

    public void crearHabitacion(Habitacion habitacion) {
        String sql = "INSERT INTO habitacion (idTipoHabitacion, estado, idHabitacion) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.gettipoHabitacion().getIdTipo());
            ps.setBoolean(2, false);
            ps.setInt(3, habitacion.getidHabitacion());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion no creada");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear habitacion");
        }
    }

    public void ocuparHabitacion(int idH) {  // ocupar no solo por reserva sino tambien por fumagacion o refaccion
        String sql = "UPDATE habitacion SET estado = 1 WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idH);
            int registro = ps.executeUpdate();
            if (registro != 1) {
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ocupar la habitacion");
        }
    }

    public void liberarHabitacion(int idH) {
        String sql = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idH);
            int registro = ps.executeUpdate();
            if (registro != 1) {
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al liberar la habitacion");
        }
    }

    public void modificarHabitacion(Habitacion habi, int idTH) {
        String sql = "UPDATE habitacion SET idTipoHabitacion = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idTH);
            ps.setInt(2, habi.getidHabitacion());
            int registro = ps.executeUpdate();
            if (registro > 0) {
               
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion no encontrada (?)");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la habitacion");
        }
    }

    public TipoHabitacion buscarTipoHabitacion(int idTH) {
        TipoHabitacion tipoH = new TipoHabitacion();
        String sql = "SELECT * FROM tipodehabitacion WHERE idTipoHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idTH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tipoH.setIdTipo(idTH);
                tipoH.setNombre(rs.getString("nombreTipo"));
                tipoH.setCapacidad(rs.getInt("capacidad"));
                tipoH.setCantCamas(rs.getInt("cantCamas"));
                tipoH.setTipoCamas(rs.getString("tipoCamas"));
                tipoH.setPrecioNoche(rs.getDouble("precioNoche"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el tipo de habitacion");
        }
        return tipoH;
    }

    public TipoHabitacion buscarTipoHabitacionPorNombre(String nombreTH) {
        TipoHabitacion tipoH = new TipoHabitacion();
        String sql = "SELECT * FROM tipodehabitacion WHERE tipodehabitacion.nombreTipo= ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreTH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tipoH.setIdTipo(rs.getInt("idTipoHabitacion"));
                tipoH.setNombre(rs.getString("nombreTipo"));
                tipoH.setCapacidad(rs.getInt("capacidad"));
                tipoH.setCantCamas(rs.getInt("cantCamas"));
                tipoH.setTipoCamas(rs.getString("tipoCamas"));
                tipoH.setPrecioNoche(rs.getDouble("precioNoche"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el tipo de habitacion");
        }
        return tipoH;
    }

    public Habitacion buscarHabitacion(int idH) {
        Habitacion habi = new Habitacion();
        String sql = "SELECT * FROM habitacion WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                habi.setIdHabitacion(idH);
                TipoHabitacion tipoH = buscarTipoHabitacion(rs.getInt("idTipoHabitacion"));
                habi.settipoHabitacion(tipoH);
                habi.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la habitacion");
        }
        return habi;
    }

    public void cambiarPrecio(int idTH, double precio) {
        String sql = "UPDATE tipodehabitacion SET precioNoche = ? WHERE idTipoHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, idTH);
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "Tipo de Habitacion inexistente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el precio");
        }
    }

    public List<Habitacion> listarPorTipo(int idTH) {
        List<Habitacion> habitaciones = new ArrayList<>();
        TipoHabitacion tipoH = buscarTipoHabitacion(idTH);
        String sql = "SELECT * FROM habitacion WHERE idTipoHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idTH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habi = new Habitacion();
                habi.setIdHabitacion(rs.getInt("idHabitacion"));
                habi.settipoHabitacion(tipoH);
                habi.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habi);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar por tipo");
        }
        return habitaciones;
    }

    public List<Habitacion> listaOcupadas() {
        List<Habitacion> ocupadas = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE estado = 1";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habi = new Habitacion();
                habi.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipoH = buscarTipoHabitacion(rs.getInt("idTipoHabitacion"));
                habi.settipoHabitacion(tipoH);
                habi.setEstado(rs.getBoolean("estado"));
                ocupadas.add(habi);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar ocupadas");
        }
        return ocupadas;
    }

    public List<Habitacion> listaDesocupadas() {
        List<Habitacion> desocupadas = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE estado = 0";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habi = new Habitacion();
                habi.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipoH = buscarTipoHabitacion(rs.getInt("idTipoHabitacion"));
                habi.settipoHabitacion(tipoH);
                habi.setEstado(rs.getBoolean("estado"));
                desocupadas.add(habi);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar desocupadas");
        }
        return desocupadas;
    }

    public List<TipoHabitacion> listarTipoH() {
        List<TipoHabitacion> tipoHabitaciones = new ArrayList<>();
        String sql = "SELECT * FROM `tipodehabitacion` WHERE 1";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tipoH = new TipoHabitacion();
                tipoH.setIdTipo(rs.getInt("idTipoHabitacion"));
                tipoH.setNombre(rs.getString("nombreTipo"));
                tipoH.setCapacidad(rs.getInt("capacidad"));
                tipoH.setCantCamas(rs.getInt("cantCamas"));
                tipoH.setTipoCamas(rs.getString("tipoCamas"));
                tipoH.setPrecioNoche(rs.getDouble("precioNoche"));
                tipoHabitaciones.add(tipoH);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los tipos de habitación");
        }
        return tipoHabitaciones;
    }
}
