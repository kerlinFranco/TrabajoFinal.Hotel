package Interfaz;

import AccesoADatos.Conexion;
import java.awt.Image;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {

    public static int contador;

    public Principal() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        conectar();
        contador = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jBotonHuesped = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jBotonHabitacion = new javax.swing.JToggleButton();
        jBotonReserva = new javax.swing.JToggleButton();
        jBotonSalir = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(180, 120));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(28, 8, 0));

        jBotonHuesped.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jBotonHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jBotonHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HuespedPrincipalApagdo.png"))); // NOI18N
        jBotonHuesped.setText("Huesped");
        jBotonHuesped.setToolTipText("Gestión de\n Huespedes");
        jBotonHuesped.setContentAreaFilled(false);
        jBotonHuesped.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonHuesped.setIconTextGap(8);
        jBotonHuesped.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HuespedPrincipalEncendido.png"))); // NOI18N
        jBotonHuesped.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HuespedPrincipalEncendido.png"))); // NOI18N
        jBotonHuesped.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HuespedPrincipalEncendido.png"))); // NOI18N
        jBotonHuesped.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jBotonHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonHuespedActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoHotel3.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jBotonHabitacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jBotonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jBotonHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionPequeñaApagada.png"))); // NOI18N
        jBotonHabitacion.setText("Habitación");
        jBotonHabitacion.setToolTipText("Gestión de\nHabitaciones");
        jBotonHabitacion.setBorderPainted(false);
        jBotonHabitacion.setContentAreaFilled(false);
        jBotonHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonHabitacion.setIconTextGap(11);
        jBotonHabitacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBotonHabitacion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jBotonHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonHabitacionActionPerformed(evt);
            }
        });

        jBotonReserva.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jBotonReserva.setForeground(new java.awt.Color(255, 255, 255));
        jBotonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva-pequeño(apagado).png"))); // NOI18N
        jBotonReserva.setText("Reserva");
        jBotonReserva.setToolTipText("Gestión de\nReservas");
        jBotonReserva.setContentAreaFilled(false);
        jBotonReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonReserva.setIconTextGap(8);
        jBotonReserva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva_grande(encendido).png"))); // NOI18N
        jBotonReserva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva_grande(encendido).png"))); // NOI18N
        jBotonReserva.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva_grande(encendido).png"))); // NOI18N
        jBotonReserva.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jBotonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonReservaActionPerformed(evt);
            }
        });

        jBotonSalir.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jBotonSalir.setForeground(new java.awt.Color(204, 204, 204));
        jBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoSalirApagado.png"))); // NOI18N
        jBotonSalir.setToolTipText("Salir");
        jBotonSalir.setContentAreaFilled(false);
        jBotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        jBotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        jBotonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        jBotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBotonReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBotonHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recepcionHotelPrincipal2.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jBotonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonReservaActionPerformed
        if (contador == 0) {
            contador++;
            GestionReserva gr = new GestionReserva();
            gr.setVisible(true);
            gr.setLocation(137, 1);
            escritorio.add(gr);
            escritorio.moveToFront(gr);
        }
    }//GEN-LAST:event_jBotonReservaActionPerformed

    private void jBotonHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonHabitacionActionPerformed
        if (contador == 0) {
            contador++;
            GestionHabitacion gha = new GestionHabitacion();
            gha.setVisible(true);
            gha.setLocation(300, 20);
            escritorio.add(gha);
            escritorio.moveToFront(gha);
        }
    }//GEN-LAST:event_jBotonHabitacionActionPerformed

    private void jBotonHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonHuespedActionPerformed
        if (contador == 0) {
            contador++;
            GestionHuesped ghu = new GestionHuesped();
            ghu.setVisible(true);
            ghu.setLocation(450, 1);
            escritorio.add(ghu);
            escritorio.moveToFront(ghu);
        }
    }//GEN-LAST:event_jBotonHuespedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JToggleButton jBotonHabitacion;
    private javax.swing.JToggleButton jBotonHuesped;
    private javax.swing.JToggleButton jBotonReserva;
    private javax.swing.JToggleButton jBotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 
    private void conectar() {
        Conexion con = new Conexion("jdbc:mariadb://localhost:3306/", "hotel31", "root", "");
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono2.png"));
        return retValue;
    }
}
