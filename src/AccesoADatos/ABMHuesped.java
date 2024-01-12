package AccesoADatos;

import Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ABMHuesped {

    private Connection conn = null;

    public ABMHuesped() {
        conn = Conexion.getConexion();
    }

    public void guardarHuesped(Huesped huesped) {
        String sql = "INSERT INTO `huesped`( `nombre`,apellido, `dni`, `domicilio`, `correo`, `celular`, `estado`) "
                + "VALUES (?,?,?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setLong(6, huesped.getCelular());
            ps.setBoolean(7, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
                
            } else {
                JOptionPane.showMessageDialog(null, "No se puede obtener el id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar huesped");
        }
    }

    public List<Huesped> listarHuespedes() {
        List<Huesped> huespedes = new ArrayList<>();
        String sql = "SELECT * FROM `huesped` WHERE estado=1";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Huesped h = new Huesped();
                h.setIdHuesped(rs.getInt("idHuesped"));
                h.setNombre(rs.getString("nombre"));
                h.setApellido(rs.getString("apellido"));
                h.setDni(rs.getInt("dni"));
                h.setDomicilio(rs.getString("domicilio"));
                h.setCorreo(rs.getString("correo"));
                h.setCelular(rs.getLong("celular"));
                h.setEstado(rs.getBoolean("estado"));
                huespedes.add(h);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los huespedes");
        }
        return huespedes;
    }

    public Huesped buscarHuesped(int dni) {
        Huesped h = new Huesped();
        String sql = "SELECT * FROM `huesped` WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                h.setIdHuesped(rs.getInt("idHuesped"));
                h.setNombre(rs.getString("nombre"));
                h.setApellido(rs.getString("apellido"));
                h.setDni(rs.getInt("dni"));
                h.setDomicilio(rs.getString("domicilio"));
                h.setCelular(rs.getLong("celular"));
                h.setCorreo(rs.getString("correo"));
                h.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar huesped");
        }
        return h;
    }

    public Huesped buscarHuespedPorId(int idH) {
        Huesped h = new Huesped();
        String sql = "SELECT * FROM `huesped` WHERE idHuesped=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                h.setIdHuesped(idH);
                h.setNombre(rs.getString("nombre"));
                h.setApellido(rs.getString("apellido"));
                h.setDni(rs.getInt("dni"));
                h.setDomicilio(rs.getString("domicilio"));
                h.setCelular(rs.getLong("celular"));
                h.setCorreo(rs.getString("correo"));
                h.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar huesped");
        }
        return h;
    }

    public void bajaHuesped(int dni) {
        String sql = "UPDATE `huesped` SET `estado`=0 WHERE dni=? ";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el huesped");
            } else {
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al dar de baja");
        }
    }

    public void altaHuesped(int dni) {
        String sql = "UPDATE `huesped` SET `estado`=1 WHERE dni=? ";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el huesped");
            } else {
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al dar de alta");
        }
    }

    public void modificarHuesped(Huesped h) {
        String sql = "UPDATE `huesped` SET `nombre`=?,apellido=?, `domicilio`=?,`correo`=?,`"
                + "celular`=? WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(6, h.getDni());
            ps.setString(1, h.getNombre());
            ps.setString(2, h.getApellido());
            ps.setString(3, h.getDomicilio());
            ps.setString(4, h.getCorreo());
            ps.setLong(5, h.getCelular());
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, " No se modifico el huesped");
            } else {
                JOptionPane.showMessageDialog(null, " Se modifico el huesped");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al modificar huesped");
        }
    }
}
