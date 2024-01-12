package Interfaz;

import AccesoADatos.ABMHabitacion;
import AccesoADatos.ABMReserva;
import Entidades.Habitacion;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class GestionHabitacion extends javax.swing.JInternalFrame {

    ABMHabitacion ABMHabi = new ABMHabitacion();
    ABMReserva ABMR = new ABMReserva();

    private final DefaultTableModel modeloT = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int colum) {
            return false;
        }
    };

    public GestionHabitacion() {
        initComponents();
        redondearCajasDeTexto();
        labelPrecio.setVisible(false);
        jTextoPrecio.setVisible(false);
        botonCambiarPrecio.setVisible(false);
        armarCabecera();
        cargarTipoH();
        limpiarT();
        activarDesactivarBuscar();
        activarDesactivarNueva();
        activarDesactivarPrecio();
        activarDesactivarModificar();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelHabitacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        TextoNumero = new javax.swing.JTextField();
        ComboTipoH = new javax.swing.JComboBox<>();
        TextoEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitacion = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JButton();
        BotonAltaBaja = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        botonPrecio = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        jTextoPrecio = new javax.swing.JTextField();
        botonCambiarPrecio = new javax.swing.JButton();

        setFrameIcon(null);

        titulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Gestión Habitación");

        labelHabitacion.setText("N° Habitación");

        jLabel3.setText("Tipo de Habitación");

        labelEstado.setText("Estado");

        TextoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoNumeroKeyReleased(evt);
            }
        });

        ComboTipoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoHActionPerformed(evt);
            }
        });

        TextoEstado.setEditable(false);

        TablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaHabitacion);

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarApagado.png"))); // NOI18N
        BotonBuscar.setToolTipText("Buscar Habitacion");
        BotonBuscar.setContentAreaFilled(false);
        BotonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonAltaBaja.setText("Estado");
        BotonAltaBaja.setToolTipText("Modificar Estado");
        BotonAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaBajaActionPerformed(evt);
            }
        });

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirApagado(2).png"))); // NOI18N
        BotonSalir.setToolTipText("Inicio");
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionApagado.png"))); // NOI18N
        BotonGuardar.setToolTipText("Nueva Habitación");
        BotonGuardar.setContentAreaFilled(false);
        BotonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-apagado.png"))); // NOI18N
        BotonModificar.setToolTipText("Guardar Cambios");
        BotonModificar.setContentAreaFilled(false);
        BotonModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        botonPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGHabiApagadp.png"))); // NOI18N
        botonPrecio.setToolTipText("Cambiar Precio");
        botonPrecio.setContentAreaFilled(false);
        botonPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png"))); // NOI18N
        botonPrecio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png"))); // NOI18N
        botonPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrecioActionPerformed(evt);
            }
        });

        labelPrecio.setText("Precio");

        jTextoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextoPrecioKeyReleased(evt);
            }
        });

        botonCambiarPrecio.setText("Cambiar Precio");
        botonCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelPrecio)
                        .addGap(71, 71, 71)
                        .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(botonCambiarPrecio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(labelHabitacion)
                            .addComponent(labelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(BotonAltaBaja))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonBuscar)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHabitacion)
                            .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonBuscar)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado)
                    .addComponent(BotonAltaBaja))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCambiarPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        try {
            limpiarT();
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.getidHabitacion() != 0) {
                ComboTipoH.setSelectedItem(habi.gettipoHabitacion().getNombre());
                TextoEstado.setText(habi.isEstado() ? "Ocupada" : "Libre");
                BotonAltaBaja.setText(habi.isEstado() ? "Alta" : "Baja");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la habitación");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de habitacion valido");
        }
        activarDesactivarNueva();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void ComboTipoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoHActionPerformed
        TipoHabitacion tH = ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + "");
        limpiarT();
        cargarDatos(tH);
        activarDesactivarModificar();
    }//GEN-LAST:event_ComboTipoHActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        Habitacion h = new Habitacion();
        try {
            if (verificaHabitacion()) {
                if (ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText())).getidHabitacion() == 0) {
                    h.setIdHabitacion(Integer.parseInt(TextoNumero.getText()));
                    h.settipoHabitacion(ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + ""));
                    h.setEstado(false);
                    ABMHabi.crearHabitacion(h);
                    BotonGuardar.setEnabled(false);
                    BotonModificar.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Habitacion creada");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe una habitacion con ese número");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las habitaciones solo pueden ir del 1 al 200");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de habitacion valido");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void botonPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrecioActionPerformed
        if (titulo.getText().equals("Gestión Habitación")) {
            labelPrecio.setVisible(true);
            jTextoPrecio.setVisible(true);
            botonCambiarPrecio.setVisible(true);
            BotonGuardar.setVisible(false);
            BotonModificar.setVisible(false);
            BotonBuscar.setVisible(false);
            BotonAltaBaja.setVisible(false);
            TextoEstado.setVisible(false);
            TextoNumero.setVisible(false);
            labelEstado.setVisible(false);
            labelHabitacion.setVisible(false);
            titulo.setText("Gestión Precio");
            botonPrecio.setToolTipText("Gestion Habitacion");
            botonPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifHabitacion(apagado).png")));
            botonPrecio.setContentAreaFilled(false);
            botonPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifHabitacion(encendido).png")));
            botonPrecio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifHabitacion(encendido).png")));
        } else {
            labelPrecio.setVisible(false);
            jTextoPrecio.setVisible(false);
            botonCambiarPrecio.setVisible(false);
            BotonGuardar.setVisible(true);
            BotonModificar.setVisible(true);
            BotonBuscar.setVisible(true);
            BotonAltaBaja.setVisible(true);
            TextoEstado.setVisible(true);
            TextoNumero.setVisible(true);
            labelEstado.setVisible(true);
            labelHabitacion.setVisible(true);
            titulo.setText("Gestión Habitación");
            botonPrecio.setToolTipText("Cambiar Precio");
            botonPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGHabiApagadp.png")));
            botonPrecio.setContentAreaFilled(false);
            botonPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png")));
            botonPrecio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png")));
        }
    }//GEN-LAST:event_botonPrecioActionPerformed

    private void botonCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecioActionPerformed
        try {
            double precio = Double.parseDouble(jTextoPrecio.getText().replace(',', '.'));
            if (precio > 0) {
                TipoHabitacion tipoH = ABMHabi.buscarTipoHabitacionPorNombre((String) ComboTipoH.getSelectedItem());
                int idTH = tipoH.getIdTipo();
                ABMHabi.cambiarPrecio(idTH, precio);
                jTextoPrecio.setText("");
                TablaHabitacion.setValueAt(precio, 0, 4);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un precio mayor a 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numericos");
        }
    }//GEN-LAST:event_botonCambiarPrecioActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        try {
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.isEstado()) {
                JOptionPane.showMessageDialog(null, "No se puede modificar una habitacion ocupada");
            } else {
                habi.settipoHabitacion(ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + ""));
                ABMHabi.modificarHabitacion(habi, habi.gettipoHabitacion().getIdTipo());
                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de habitacion existente");
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaBajaActionPerformed
        try {
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.getidHabitacion() != 0) {
                LocalDate hoy = LocalDate.now();
                int ocupada = 0;
                if (habi.isEstado()) {
                    List<Reserva> reservas = ABMR.buscarPorHabitacion(habi);
                    if (reservas.isEmpty()) {
                        ABMHabi.liberarHabitacion(habi.getidHabitacion());
                        JOptionPane.showMessageDialog(null, "Habitación reincorporada");
                    } else {
                        for (Reserva res : reservas) {
                            if ((hoy.equals(res.getFechaEntrada()) || hoy.isAfter(res.getFechaEntrada()))
                                    && (hoy.equals(res.getFechaSalida()) || hoy.isBefore(res.getFechaSalida()))) {
                                ocupada++;
                            }
                        }
                        if (ocupada != 0) {
                            JOptionPane.showMessageDialog(null, "No se puede trabajar en una habitacion ocupada");
                        } else {
                            ABMHabi.liberarHabitacion(habi.getidHabitacion());
                            JOptionPane.showMessageDialog(null, "Habitación liberada");
                        }
                    }
                } else {
                    ABMHabi.ocuparHabitacion(habi.getidHabitacion());
                    JOptionPane.showMessageDialog(null, "Habitación fuera de servicio");
                }
                habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
                TextoEstado.setText(habi.isEstado() ? (ocupada != 0 ? "Ocupada" : "Fuera de servicio") : "Libre");
                BotonAltaBaja.setText(habi.isEstado() ? "Alta" : "Baja");
            } else {
                JOptionPane.showMessageDialog(null, "Esa habitacion no existe");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de habitacion existente");
        }
    }//GEN-LAST:event_BotonAltaBajaActionPerformed

    private void TextoNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoNumeroKeyReleased
        activarDesactivarBuscar();
        activarDesactivarModificar();
        activarDesactivarNueva();
    }//GEN-LAST:event_TextoNumeroKeyReleased

    private void jTextoPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoPrecioKeyReleased
        activarDesactivarPrecio();
    }//GEN-LAST:event_jTextoPrecioKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaBaja;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboTipoH;
    private javax.swing.JTable TablaHabitacion;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoNumero;
    private javax.swing.JButton botonCambiarPrecio;
    private javax.swing.JButton botonPrecio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextoPrecio;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cargarTipoH() {
        List<TipoHabitacion> tipoHabitaciones = ABMHabi.listarTipoH();
        for (TipoHabitacion tipo : tipoHabitaciones) {
            ComboTipoH.addItem(tipo.getNombre());
        }
    }

    private void armarCabecera() {
        modeloT.setColumnCount(5);
        TablaHabitacion.setModel(modeloT);
        TablaHabitacion.setRowHeight(65);
        JTableHeader tableHeader = TablaHabitacion.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue("Nombre");
        TableColumn tableColumn1 = tableColumnModel.getColumn(1);
        tableColumn1.setHeaderValue("Capacidad");
        TableColumn tableColumn2 = tableColumnModel.getColumn(2);
        tableColumn2.setHeaderValue("N° Camas");
        TableColumn tableColumn3 = tableColumnModel.getColumn(3);
        tableColumn3.setHeaderValue("Tipo Camas");
        TableColumn tableColumn4 = tableColumnModel.getColumn(4);
        tableColumn4.setHeaderValue("Precio");
        float[] anchoColumnaPorcentaje = {0.16f, 0.205f, 0.185f, 0.23f, 0.18f};
        resizeColumnas(anchoColumnaPorcentaje);
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(JLabel.CENTER);
        centrado.setVerticalAlignment(JLabel.TOP);
        for (int columna = 0; columna < TablaHabitacion.getColumnCount(); columna++) {
            TablaHabitacion.getColumnModel().getColumn(columna).setCellRenderer(centrado);
        }
    }

    private void limpiarT() {
        int tamaño = TablaHabitacion.getRowCount();
        if (tamaño != -1) {
            for (int i = tamaño - 1; i >= 0; i--) {
                modeloT.removeRow(i);
            }
        }
    }

    public void cargarDatos(TipoHabitacion tH) {
        String nombre = "<html><div align=center>" + tH.getNombre();
        String tipoCamas = "<html><div align=center>" + tH.getTipoCamas();
        modeloT.addRow(new Object[]{nombre, tH.getCapacidad(), tH.getCantCamas(), tipoCamas, tH.getPrecioNoche()});
    }

    private void redondearCajasDeTexto() {
        TextoEstado.putClientProperty("JComponent.roundRect", true);
        TextoNumero.putClientProperty("JComponent.roundRect", true);
        jTextoPrecio.putClientProperty("JComponent.roundRect", true);
        ComboTipoH.putClientProperty("JComponent.roundRect", true);
        BotonAltaBaja.putClientProperty("JComponent.roundRect", true);
    }

    private boolean verificaHabitacion() {
        try {
            return Integer.parseInt(TextoNumero.getText()) > 0
                    && Integer.parseInt(TextoNumero.getText()) < 201
                    && TextoNumero.getText().matches("[0-9]*");
        } catch (NumberFormatException e) {
        }
        return false;
    }

    private void activarDesactivarBuscar() {
        if (verificaHabitacion()) {
            BotonBuscar.setEnabled(true);
        } else {
            BotonBuscar.setEnabled(false);
        }
    }

    private void activarDesactivarNueva() {
        if (verificaHabitacion()) {
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.getidHabitacion() == Integer.parseInt(TextoNumero.getText())) {
                BotonGuardar.setEnabled(false);
            } else {
                BotonGuardar.setEnabled(true);
            }
        } else {
            BotonGuardar.setEnabled(false);
        }
    }

    private void activarDesactivarModificar() {
        try {
            if (verificaHabitacion()) {
                Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
                if (habi.getidHabitacion() != 0) {
                    TipoHabitacion tipoH = habi.gettipoHabitacion();
                    if (tipoH.getNombre().equals(ComboTipoH.getSelectedItem())) {
                        BotonModificar.setEnabled(false);
                    } else {
                        BotonModificar.setEnabled(true);
                    }
                } else {
                    BotonModificar.setEnabled(false);
                }
            } else {
                BotonModificar.setEnabled(false);
            }
        } catch (NumberFormatException e) {
        }
    }

    private void activarDesactivarPrecio() {
        if (!(jTextoPrecio.getText().isEmpty()) && jTextoPrecio.getText().matches("[0-9]*[,.]?")) {
            botonCambiarPrecio.setEnabled(true);
        } else {
            botonCambiarPrecio.setEnabled(false);
        }
    }

    private void actualizar() {
        LocalDate hoy = LocalDate.now();
        List<Habitacion> habitaciones = ABMHabi.listaDesocupadas();
        for (Habitacion habi : habitaciones) {
            List<Reserva> reservas = ABMR.buscarPorHabitacion(habi);
            for (Reserva res : reservas) {
                if (hoy.equals(res.getFechaEntrada())) {
                    ABMHabi.ocuparHabitacion(habi.getidHabitacion());
                }
            }
        }
        habitaciones = ABMHabi.listaOcupadas();
        for (Habitacion habi : habitaciones) {
            List<Reserva> reservas = ABMR.buscarPorHabitacion(habi);
            for (Reserva res : reservas) {
                if (hoy.equals(res.getFechaSalida()) || hoy.isAfter(res.getFechaSalida())) {
                    ABMHabi.liberarHabitacion(habi.getidHabitacion());
                    ABMR.cancelarReserva(res.getIdReserva());
                }
            }
        }
    }

    private void resizeColumnas(float[] anchoColuPorcen) {
        TableColumn column;
        TableColumnModel jTableColumnModel = TablaHabitacion.getColumnModel();
        int tW = jTableColumnModel.getTotalColumnWidth();
        int cantCols = jTableColumnModel.getColumnCount();
        for (int i = 0; i < cantCols; i++) {
            column = jTableColumnModel.getColumn(i);
            int pWidth = Math.round(anchoColuPorcen[i] * tW);
            column.setPreferredWidth(pWidth);
        }
    }
}
