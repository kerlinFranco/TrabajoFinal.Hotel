package Interfaz;

import AccesoADatos.ABMHuesped;
import AccesoADatos.ABMReserva;
import Entidades.Huesped;
import Entidades.Reserva;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionHuesped extends javax.swing.JInternalFrame {

    ABMHuesped ABMHues = new ABMHuesped();
    ABMReserva ABMR = new ABMReserva();

    public GestionHuesped() {
        initComponents();
        redondearCajasDeTexto();
        desactivarEstado();
        activarDesactivarBuscar();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextoDni = new javax.swing.JTextField();
        jTextoNombre = new javax.swing.JTextField();
        jTextoDireccion = new javax.swing.JTextField();
        jTextoCorreo = new javax.swing.JTextField();
        jTextoCelular = new javax.swing.JTextField();
        jTextoEstado = new javax.swing.JTextField();
        jBotonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonAltaBaja = new javax.swing.JButton();

        setFrameIcon(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión Huesped");

        jLabel2.setText("D.N.I.");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        jLabel7.setText("Estado");

        jTextoDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoDniKeyReleased(evt);
            }
        });

        jTextoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoNombreKeyReleased(evt);
            }
        });

        jTextoDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoDireccionKeyReleased(evt);
            }
        });

        jTextoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoCorreoKeyReleased(evt);
            }
        });

        jTextoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoCelularKeyReleased(evt);
            }
        });

        jTextoEstado.setEditable(false);

        jBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarApagado.png"))); // NOI18N
        jBotonBuscar.setToolTipText("Buscar Huesped");
        jBotonBuscar.setContentAreaFilled(false);
        jBotonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        jBotonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        jBotonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        jBotonBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBotonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido");

        jTextoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoApellidoKeyReleased(evt);
            }
        });

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HuespedGestionApagado.png"))); // NOI18N
        botonGuardar.setToolTipText("Nuevo Huesped");
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioChicoEncendido-PhotoRoom (1) (1).png"))); // NOI18N
        botonGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioChicoEncendido-PhotoRoom (1) (1).png"))); // NOI18N
        botonGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioChicoEncendido-PhotoRoom (1) (1).png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-apagado.png"))); // NOI18N
        botonModificar.setToolTipText("Guardar Cambios");
        botonModificar.setContentAreaFilled(false);
        botonModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarApagado.png"))); // NOI18N
        botonLimpiar.setToolTipText("Limpiar");
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirApagado(2).png"))); // NOI18N
        botonSalir.setToolTipText("Inicio");
        botonSalir.setContentAreaFilled(false);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        botonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonAltaBaja.setText("Estado");
        botonAltaBaja.setToolTipText("Modificar Estado");
        botonAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(jTextoApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoCelular, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAltaBaja)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaBajaActionPerformed
        try {
            Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText().replace(".", "")));
            if (hues.getIdHuesped() != 0) {
                if (hues.isEstado()) {
                    ABMHues.bajaHuesped(hues.getDni());
                    List<Reserva> reservas = ABMR.buscarPorHuesped(hues.getDni());
                    for (Reserva res : reservas) {
                        ABMR.cancelarReserva(res.getIdReserva());
                    }
                    JOptionPane.showMessageDialog(null, " Huesped eliminado junto a sus reservas");
                    botonAltaBaja.setText("Alta");
                } else {
                    JOptionPane.showMessageDialog(null, " Huesped reingresado");
                    ABMHues.altaHuesped(hues.getDni());
                    botonAltaBaja.setText("Baja");
                }
                jTextoEstado.setText(hues.isEstado() ? "Inactivo" : "Activo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro huesped con ese DNI");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise el DNI");
        }
    }//GEN-LAST:event_botonAltaBajaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        vaciar();
        desactivarEstado();
        activarDesactivarBuscar();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try {
            if (verificaVacios()) {
                Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText().replace(".", "")));
                hues.setDni(Integer.parseInt(jTextoDni.getText().replace(".", "")));
                if (verificaNombreApellido()) {
                    if (verificaCorreo()) {
                        hues.setNombre(jTextoNombre.getText());
                        hues.setApellido(jTextoApellido.getText());
                        hues.setDomicilio(jTextoDireccion.getText());
                        hues.setCorreo(jTextoCorreo.getText());
                        hues.setCelular(Long.parseLong(jTextoCelular.getText()));
                        hues.setEstado(true);
                        if (hues.getIdHuesped() != 0) {
                            ABMHues.modificarHuesped(hues);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe un huesped con ese DNI");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Escriba un correo electronico valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de nombre/apellido no valido. \nReescriba con formato alfabetico");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos correctamente");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try {
            if (verificaVacios()) {
                Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText().replace(".", "")));
                hues.setDni(Integer.parseInt(jTextoDni.getText().replace(".", "")));
                if (verificaNombreApellido()) {
                    if (verificaCorreo()) {
                        hues.setNombre(jTextoNombre.getText().trim());
                        hues.setApellido(jTextoApellido.getText().trim());
                        hues.setDomicilio(jTextoDireccion.getText());
                        hues.setCorreo(jTextoCorreo.getText());
                        hues.setCelular(Long.parseLong(jTextoCelular.getText()));
                        hues.setEstado(true);
                        if (hues.getIdHuesped() == 0) {
                            ABMHues.guardarHuesped(hues);
                            botonGuardar.setEnabled(false);
                            botonModificar.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Huesped guardado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Ya existe un huesped con ese DNI");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Escriba un correo electronico valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de nombre/apellido no valido. \nReescriba con formato alfabetico");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos correctamente");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        try {
            Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText().replace(".", "")));
            if (hues.getIdHuesped() != 0) {
                jLabel7.setVisible(true);
                jTextoEstado.setVisible(true);
                botonAltaBaja.setVisible(true);
                jTextoNombre.setText(hues.getNombre());
                jTextoApellido.setText(hues.getApellido());
                jTextoDireccion.setText(hues.getDomicilio());
                jTextoCorreo.setText(hues.getCorreo());
                jTextoCelular.setText(hues.getCelular() + "");
                jTextoEstado.setText(hues.isEstado() ? "Activo" : "Inactivo");
                if (hues.isEstado()) {
                    botonAltaBaja.setText("Baja");
                } else {
                    botonAltaBaja.setText("Alta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro huesped con ese DNI");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Rellene el campo DNI correctamente");
        }
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void jTextoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoNombreKeyReleased
        desactivarEstado();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoNombreKeyReleased

    private void jTextoApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoApellidoKeyReleased
        desactivarEstado();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoApellidoKeyReleased

    private void jTextoDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoDireccionKeyReleased
        desactivarEstado();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoDireccionKeyReleased

    private void jTextoCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoCorreoKeyReleased
        desactivarEstado();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoCorreoKeyReleased

    private void jTextoCelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoCelularKeyReleased
        desactivarEstado();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoCelularKeyReleased

    private void jTextoDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoDniKeyReleased
        desactivarEstado();
        activarDesactivarBuscar();
        activarDesactivarGM();
        activaDesactivaLimpiar();
    }//GEN-LAST:event_jTextoDniKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAltaBaja;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTextoCelular;
    private javax.swing.JTextField jTextoCorreo;
    private javax.swing.JTextField jTextoDireccion;
    private javax.swing.JTextField jTextoDni;
    private javax.swing.JTextField jTextoEstado;
    private javax.swing.JTextField jTextoNombre;
    // End of variables declaration//GEN-END:variables

    public void vaciar() {
        jTextoCelular.setText("");
        jTextoCorreo.setText("");
        jTextoDireccion.setText("");
        jTextoDni.setText("");
        jTextoNombre.setText("");
        jTextoEstado.setText("");
        jTextoApellido.setText("");
    }

    private void redondearCajasDeTexto() {
        jTextoApellido.putClientProperty("JComponent.roundRect", true);
        jTextoCelular.putClientProperty("JComponent.roundRect", true);
        jTextoCorreo.putClientProperty("JComponent.roundRect", true);
        jTextoDireccion.putClientProperty("JComponent.roundRect", true);
        jTextoDireccion.putClientProperty("JComponent.roundRect", true);
        jTextoDni.putClientProperty("JComponent.roundRect", true);
        jTextoEstado.putClientProperty("JComponent.roundRect", true);
        jTextoNombre.putClientProperty("JComponent.roundRect", true);
    }

    private boolean verificaVacios() {
        return !(jTextoDni.getText().isEmpty() || jTextoNombre.getText().isEmpty() || jTextoApellido.getText().isEmpty()
                || jTextoDireccion.getText().isEmpty() || jTextoCorreo.getText().isEmpty() || jTextoCelular.getText().isEmpty());
    }

    private boolean verificaAlgunVacio() {
        return !(jTextoDni.getText().isEmpty() && jTextoNombre.getText().isEmpty() && jTextoApellido.getText().isEmpty()
                && jTextoDireccion.getText().isEmpty() && jTextoCorreo.getText().isEmpty() && jTextoCelular.getText().isEmpty());
    }

    private boolean verificaNombreApellido() {
        return jTextoNombre.getText().matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$")
                && jTextoApellido.getText().matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    }

    private boolean verificaCorreo() {
        return jTextoCorreo.getText().matches("[-\\w\\.]+@\\D+\\.\\D{3}+");
    }

    private boolean verificarDni() {
        return jTextoDni.getText().matches("[0-9]*") && jTextoDni.getText().length() < 11 && jTextoDni.getText().length() > 6;
    }

    private boolean verificarDireccion() {
        return jTextoDireccion.getText().matches("(\\w+[ ]?\\w*){1,6}");
    }

    private boolean verificarCelular() {
        return jTextoCelular.getText().matches("[0-9]*") && jTextoCelular.getText().length() >= 6;
    }

    private void desactivarEstado() {
        jLabel7.setVisible(false);
        jTextoEstado.setVisible(false);
        botonAltaBaja.setVisible(false);
    }

    private void activarDesactivarBuscar() {
        if (!verificarDni()) {
            jBotonBuscar.setEnabled(false);
        } else {
            jBotonBuscar.setEnabled(true);
        }
    }

    private void activarDesactivarGM() {
        try {
            if (verificaVacios() && verificaNombreApellido() && verificaCorreo()
                    && verificarDni() && verificarCelular() && verificarDireccion()) {
                Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
                if (hues.getDni() != Integer.parseInt(jTextoDni.getText())) {
                    botonModificar.setEnabled(false);
                    botonGuardar.setEnabled(true);
                } else {
                    botonGuardar.setEnabled(false);
                    if (hues.getNombre().equals(jTextoNombre.getText()) && hues.getApellido().equals(jTextoApellido.getText())
                            && hues.getDomicilio().equals(jTextoDireccion.getText()) && hues.getCorreo().equals(jTextoCorreo.getText())
                            && hues.getCelular() == Long.parseLong(jTextoCelular.getText())) {
                        botonModificar.setEnabled(false);
                    } else {
                        botonModificar.setEnabled(true);
                    }
                }
            } else {
                botonGuardar.setEnabled(false);
                botonModificar.setEnabled(false);
            }
        } catch (NumberFormatException e) {
        }
    }

    private void activaDesactivaLimpiar() {
        if (verificaAlgunVacio()) {
            botonLimpiar.setEnabled(true);
        } else {
            botonLimpiar.setEnabled(false);
        }
    }
}
