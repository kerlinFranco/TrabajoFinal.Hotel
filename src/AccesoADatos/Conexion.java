package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String url;
    private static String BD;
    private static String usuario;
    private static String password;
    private static Connection connexion = null;

    public Conexion(String url, String bd, String usu, String pass) {
        Conexion.url = url;
        Conexion.BD = bd;
        Conexion.usuario = usu;
        Conexion.password = pass;
    }

    public static Connection getConexion() {
        if (connexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connexion = DriverManager.getConnection(url + BD, usuario, password);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver  \n" + ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex);
            }
        }
        return connexion;
    }
}
