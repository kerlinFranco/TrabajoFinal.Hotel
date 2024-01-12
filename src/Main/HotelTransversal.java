package Main;

import Interfaz.Principal;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class HotelTransversal {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatHiberbeeDarkIJTheme.setup();
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Falló al iniciar FlatLaf");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }
}
