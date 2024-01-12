package Interfaz;

import AccesoADatos.ABMHabitacion;
import AccesoADatos.ABMHuesped;
import AccesoADatos.ABMReserva;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.awt.Component;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class GestionReserva extends javax.swing.JInternalFrame {

    ABMReserva ABMR = new ABMReserva();
    ABMHabitacion ABMHabi = new ABMHabitacion();
    ABMHuesped ABMHues = new ABMHuesped();
    DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable() {
            return false;
        }
    };

    public GestionReserva() {
        initComponents();
        redondearCajasDeTexto();
        armarCabecera();
        actualizar();
        activarDesactivarBuscarDni();
        activarDesactivarBuscarHabi();
        activarDesactivarNuevo();
        activarDesactivarModificar();
        activarDesactivarCancelar();
        textoFechasNoEditable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDFechaEgreso = new com.toedter.calendar.JDateChooser();
        jDFechaIngreso = new com.toedter.calendar.JDateChooser();
        TextoDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();
        botonNueva = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textoCantPers = new javax.swing.JTextField();
        BotonBuscarDni = new javax.swing.JButton();
        RHabitaciones = new javax.swing.JRadioButton();
        RReservas = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        BotonHistorial = new javax.swing.JButton();

        setFrameIcon(null);

        titulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Gestión Reserva");

        jLabel3.setText("DNI");

        jLabel2.setText("Fecha Ingreso");

        jLabel4.setText("Fecha Egreso");

        jDFechaEgreso.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        jDFechaEgreso.setRequestFocusEnabled(false);
        jDFechaEgreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaEgresoPropertyChange(evt);
            }
        });

        jDFechaIngreso.setMinSelectableDate(Date.valueOf(LocalDate.now())
        );
        jDFechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaIngresoPropertyChange(evt);
            }
        });

        TextoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoDNIKeyReleased(evt);
            }
        });

        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaReserva.setToolTipText("");
        tablaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReserva);
        if (tablaReserva.getColumnModel().getColumnCount() > 0) {
            tablaReserva.getColumnModel().getColumn(0).setResizable(false);
            tablaReserva.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tablaReserva.getColumnModel().getColumn(1).setResizable(false);
            tablaReserva.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tablaReserva.getColumnModel().getColumn(2).setResizable(false);
            tablaReserva.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tablaReserva.getColumnModel().getColumn(3).setResizable(false);
            tablaReserva.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        botonNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaNuevaApagado.png"))); // NOI18N
        botonNueva.setToolTipText("Nueva Reserva");
        botonNueva.setContentAreaFilled(false);
        botonNueva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaNuevaEncendido.png"))); // NOI18N
        botonNueva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaNuevaEncendido.png"))); // NOI18N
        botonNueva.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaNuevaEncendido.png"))); // NOI18N
        botonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaActionPerformed(evt);
            }
        });

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaCancelarApagado.png"))); // NOI18N
        botonCancelar.setToolTipText("Cancelar Reserva");
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaCancelarEncendido.png"))); // NOI18N
        botonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaCancelarEncendido.png"))); // NOI18N
        botonCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GReservaCancelarEncendido.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
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

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarApagado.png"))); // NOI18N
        botonBuscar.setToolTipText("Buscar Habitacion\n    Disponible");
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        botonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        botonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("N° de Huespedes");

        textoCantPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoCantPersKeyReleased(evt);
            }
        });

        BotonBuscarDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarApagado.png"))); // NOI18N
        BotonBuscarDni.setToolTipText("Buscar Reservas\n   del Huesped");
        BotonBuscarDni.setContentAreaFilled(false);
        BotonBuscarDni.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscarDni.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscarDni.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarDniActionPerformed(evt);
            }
        });

        RHabitaciones.setSelected(true);
        RHabitaciones.setText("Habitaciones");
        RHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHabitacionesActionPerformed(evt);
            }
        });

        RReservas.setText("Reservas");
        RReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RReservasActionPerformed(evt);
            }
        });

        jLabel6.setText("Ver");

        BotonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialApagado.png"))); // NOI18N
        BotonHistorial.setToolTipText("Historial");
        BotonHistorial.setContentAreaFilled(false);
        BotonHistorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialEncendido.png"))); // NOI18N
        BotonHistorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialEncendido.png"))); // NOI18N
        BotonHistorial.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialEncendido.png"))); // NOI18N
        BotonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jDFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(RHabitaciones)
                        .addGap(72, 72, 72)
                        .addComponent(RReservas)))
                .addGap(30, 134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(botonNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(botonModificar)
                .addGap(49, 49, 49)
                .addComponent(botonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonHistorial)
                .addGap(49, 49, 49)
                .addComponent(botonSalir)
                .addGap(47, 47, 47))
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDFechaEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RHabitaciones)
                    .addComponent(RReservas)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        actualizar();
        limpiarT();
        RReservas.setSelected(false);
        RHabitaciones.setSelected(true);
        armarCabecera();
        centralizar();
        try {
            int cantPersonas = Integer.parseInt(textoCantPers.getText());
            LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (comprobarFechas(ingreso, egreso)) {
                List<Habitacion> habitaciones = ABMR.buscarHabitacionParaReserva(cantPersonas, ingreso, egreso);
                for (Habitacion habi : habitaciones) {
                    cargarTabla(ingreso, egreso, habi);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
            }
        } catch (NumberFormatException | NullPointerException | DateTimeException e) {
            JOptionPane.showMessageDialog(null, "Error en busqueda de habitaciones para reservar");
        }
        activarDesactivarCancelar();
        activarDesactivarModificar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaActionPerformed
        if (RHabitaciones.isSelected()) {
            try {
                LocalDate hoy = LocalDate.now();
                LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (comprobarFechas(hoy, ingreso) || ingreso.equals(hoy)) {
                    LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    if (comprobarFechas(ingreso, egreso)) {
                        Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(TextoDNI.getText()));
                        if (hues.getIdHuesped() != 0) {
                            Reserva res = new Reserva();
                            res.setHuesped(hues);
                            res.setHabitacion(ABMHabi.buscarHabitacion((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0)));
                            res.setFechaEntrada(jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                            res.setFechaSalida(jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                            res.setCantPersonas(Integer.parseInt(textoCantPers.getText()));
                            res.setImporteTotal(ABMR.calcularPrecioEstadia(ingreso, egreso, res.getHabitacion()));
                            res.setEstado(true);
                            ABMR.crearReserva(res);
                            ABMHabi.ocuparHabitacion(res.getHabitacion().getidHabitacion());
                            modeloTabla.removeRow(tablaReserva.getSelectedRow());
                            botonModificar.setEnabled(false);
                            botonNueva.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Reserva generada");
                        } else {
                            JOptionPane.showMessageDialog(null, "El huesped no se encuentra registrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha de ingreso no puede ser anterior a la fecha actual");
                }
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Complete los campos correspondientes");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Seleccione una habitacion a reservar y vuelva a intentarlo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una habitacion a reservar y vuelva a intentarlo");
        }
        actualizar();
    }//GEN-LAST:event_botonNuevaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        if (RReservas.isSelected()) {
            try {
                int idRes = (int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0);
                ABMR.cancelarReserva(idRes);
                JOptionPane.showMessageDialog(null, "Reserva cancelada");
                modeloTabla.removeRow(tablaReserva.getSelectedRow());
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva del huesped y vuelva a intentarlo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una reserva del huesped y vuelva a intentarlo");
        }
        actualizar();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (RReservas.isSelected()) {
            try {
                Reserva res = ABMR.buscarPorId((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0));
                LocalDate hoy = LocalDate.now();
                LocalDate ingresoActual = res.getFechaEntrada();
                LocalDate egresoActual = res.getFechaSalida();
                int cantPersonas = Integer.parseInt(textoCantPers.getText());
                LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if ((ingresoActual.equals(ingreso) || hoy.isBefore(ingreso)) && egreso.isAfter(hoy)
                        && egreso.isAfter(egresoActual) && (egresoActual.isEqual(hoy) || egresoActual.isAfter(hoy))) {
                    if (comprobarFechas(ingreso, egreso)) {
                        res.setCantPersonas(cantPersonas);
                        res.setFechaEntrada(ingreso);
                        res.setFechaSalida(egreso);
                        double total = ABMR.calcularPrecioEstadia(ingreso, egreso, res.getHabitacion());
                        res.setImporteTotal(total);
                        ABMR.cancelarReserva(res.getIdReserva());
                        if (res.getHabitacion().gettipoHabitacion().getCapacidad() >= cantPersonas) {
                            ABMHabi.liberarHabitacion(res.getHabitacion().getidHabitacion());
                            List<Habitacion> habis = ABMR.buscarHabitacionParaReserva(cantPersonas, ingreso, egreso);
                            for (Habitacion habi : habis) {
                                if (habi.getidHabitacion() == res.getHabitacion().getidHabitacion()) {
                                    int respuesta = JOptionPane.showConfirmDialog(this, "El costo final sera $" + total + ".\n"
                                            + "Desea confirmar las modificaciones de esa reserva?"); // 0 = si // 1 = no // 2 = cancelar
                                    switch (respuesta) {
                                        case 0:
                                            ABMR.modificarReserva(res);
                                            ABMHabi.ocuparHabitacion(habi.getidHabitacion());
                                            limpiarT();
                                            cargarTablaR(res);
                                            JOptionPane.showMessageDialog(null, "Reserva modificada");
                                            break;
                                        case 1:
                                            ABMHabi.ocuparHabitacion(habi.getidHabitacion());
                                            JOptionPane.showMessageDialog(null, "No se modifico la reserva");
                                            break;
                                        case 2:
                                            ABMHabi.ocuparHabitacion(habi.getidHabitacion());
                                            break;
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad maxima es de "
                                    + res.getHabitacion().gettipoHabitacion().getCapacidad() + " personas");
                        }
                        ABMR.AltaReserva(res.getIdReserva());
                    } else {
                        JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
                }
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva de la tabla");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una reserva del huesped y vuelva a intentarlo");
        }
        actualizar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void RHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHabitacionesActionPerformed
        limpiarT();
        if (RHabitaciones.isSelected()) {
            RReservas.setSelected(false);
            armarCabecera();
        }
        activarDesactivarCancelar();
        activarDesactivarModificar();
        activarDesactivarNuevo();
    }//GEN-LAST:event_RHabitacionesActionPerformed

    private void RReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RReservasActionPerformed
        limpiarT();
        if (RReservas.isSelected()) {
            RHabitaciones.setSelected(false);
            armarCabecera();
        }
        activarDesactivarCancelar();
        activarDesactivarModificar();
        activarDesactivarNuevo();
    }//GEN-LAST:event_RReservasActionPerformed

    private void BotonBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarDniActionPerformed
        try {
            if (titulo.getText().equals("Gestión Reserva")) {
                limpiarT();
                RReservas.setSelected(true);
                RHabitaciones.setSelected(false);
                activarDesactivarCancelar();
                armarCabecera();
                centralizar();
                List<Reserva> listaRes = ABMR.buscarPorHuesped(Integer.parseInt(TextoDNI.getText().replace(".", "")));
                for (Reserva res : listaRes) {
                    cargarTablaR(res);
                }
                if (listaRes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay reservas de ese Huesped");
                } else {
                    actualizaAltoFilas();
                }
            } else {
                limpiarT();
                RReservas.setSelected(true);
                RHabitaciones.setSelected(false);
                armarCabecera();
                centralizar();
                List<Reserva> listaRes = ABMR.buscarTodasPorHuesped(Integer.parseInt(TextoDNI.getText().replace(".", "")));
                for (Reserva res : listaRes) {
                    cargarTablaR(res);
                }
                if (listaRes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay reservas de ese Huesped");
                } else {
                    actualizaAltoFilas();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un DNI válido");
        }
    }//GEN-LAST:event_BotonBuscarDniActionPerformed

    private void BotonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHistorialActionPerformed
        limpiarT();
        if (titulo.getText().equals("Gestión Reserva")) {
            titulo.setText("HISTORIAL");
            textoCantPers.setVisible(false);
            jDFechaEgreso.setVisible(false);
            jDFechaIngreso.setVisible(false);
            botonBuscar.setVisible(false);
            botonCancelar.setVisible(false);
            botonNueva.setVisible(false);
            botonModificar.setVisible(false);
            RReservas.setVisible(false);
            RHabitaciones.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            BotonHistorial.setToolTipText("Gestion Reserva");
            BotonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva-pequeño(apagado).png")));
            BotonHistorial.setContentAreaFilled(false);
            BotonHistorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva.pequeño.encendido.png")));
            BotonHistorial.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva.pequeño.encendido.png")));
        } else {
            titulo.setText("Gestión Reserva");
            textoCantPers.setVisible(true);
            jDFechaEgreso.setVisible(true);
            jDFechaIngreso.setVisible(true);
            botonBuscar.setVisible(true);
            botonCancelar.setVisible(true);
            botonNueva.setVisible(true);
            botonModificar.setVisible(true);
            RReservas.setVisible(true);
            RHabitaciones.setVisible(true);
            jLabel2.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            BotonHistorial.setToolTipText("Historial");
            BotonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialApagado.png")));
            BotonHistorial.setContentAreaFilled(false);
            BotonHistorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialEncendido.png")));
            BotonHistorial.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HistorialEncendido.png")));
        }
        armarCabecera();
    }//GEN-LAST:event_BotonHistorialActionPerformed

    private void tablaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservaMouseClicked
        try {
            if (titulo.getText().equals("Gestión Reserva")) {
                if (RReservas.isSelected()) {
                    activarDesactivarCancelar();
                    activarDesactivarModificar();
                    textoCantPers.setText((ABMR.buscarPorId((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0))).getCantPersonas() + "");
                    LocalDate ingreso = (LocalDate) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 4);
                    LocalDate egreso = (LocalDate) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 5);
                    jDFechaIngreso.setDate(Date.valueOf(ingreso));
                    jDFechaEgreso.setDate(Date.valueOf(egreso));
                } else {
                    activarDesactivarNuevo();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_tablaReservaMouseClicked

    private void TextoDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoDNIKeyReleased
        activarDesactivarBuscarDni();
        activarDesactivarNuevo();
    }//GEN-LAST:event_TextoDNIKeyReleased

    private void textoCantPersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCantPersKeyReleased
        activarDesactivarBuscarHabi();
        activarDesactivarNuevo();
        activarDesactivarModificar();
    }//GEN-LAST:event_textoCantPersKeyReleased

    private void jDFechaEgresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaEgresoPropertyChange
        activarDesactivarBuscarHabi();
        activarDesactivarNuevo();
        activarDesactivarModificar();
    }//GEN-LAST:event_jDFechaEgresoPropertyChange

    private void jDFechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaIngresoPropertyChange
        activarDesactivarBuscarHabi();
        activarDesactivarNuevo();
        activarDesactivarModificar();
    }//GEN-LAST:event_jDFechaIngresoPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarDni;
    private javax.swing.JButton BotonHistorial;
    private javax.swing.JRadioButton RHabitaciones;
    private javax.swing.JRadioButton RReservas;
    private javax.swing.JTextField TextoDNI;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNueva;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser jDFechaEgreso;
    private com.toedter.calendar.JDateChooser jDFechaIngreso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReserva;
    private javax.swing.JTextField textoCantPers;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        if (titulo.getText().equals("Gestión Reserva")) {
            if (RHabitaciones.isSelected()) {
                modeloTabla.setColumnCount(4);
                tablaReserva.setModel(modeloTabla);
                JTableHeader tableHeader = tablaReserva.getTableHeader();
                TableColumnModel tableColumnModel = tableHeader.getColumnModel();
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Habitacion");
                TableColumn tableColumn1 = tableColumnModel.getColumn(1);
                tableColumn1.setHeaderValue("Tipo de Habitacion");
                TableColumn tableColumn2 = tableColumnModel.getColumn(2);
                tableColumn2.setHeaderValue("N° Camas");
                TableColumn tableColumn3 = tableColumnModel.getColumn(3);
                tableColumn3.setHeaderValue("Total");
                float[] anchoColumnaPorcentaje = {0.15f, 0.35f, 0.15f, 0.35f};
                resizeColumns(anchoColumnaPorcentaje);
                tableHeader.repaint();
            } else {
                modeloTabla.setColumnCount(7);
                tablaReserva.setModel(modeloTabla);
                JTableHeader tableHeader = tablaReserva.getTableHeader();
                TableColumnModel tableColumnModel = tableHeader.getColumnModel();
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Id");
                TableColumn tableColumn1 = tableColumnModel.getColumn(1);
                tableColumn1.setHeaderValue("Huesped");
                TableColumn tableColumn2 = tableColumnModel.getColumn(2);
                tableColumn2.setHeaderValue("Habitacion");
                TableColumn tableColumn3 = tableColumnModel.getColumn(3);
                tableColumn3.setHeaderValue("Tipo de Habitacion");
                TableColumn tableColumn4 = tableColumnModel.getColumn(4);
                tableColumn4.setHeaderValue("Ingreso");
                TableColumn tableColumn5 = tableColumnModel.getColumn(5);
                tableColumn5.setHeaderValue("Egreso");
                TableColumn tableColumn6 = tableColumnModel.getColumn(6);
                tableColumn6.setHeaderValue("Total");
                float[] anchoColumnaPorcentaje = {0.0206f, 0.1915f, 0.0951f, 0.2650f, 0.1244f, 0.1244f, 0.1464f};
                resizeColumns(anchoColumnaPorcentaje);
                tableHeader.repaint();
            }
        } else {
            modeloTabla.setColumnCount(7);
            tablaReserva.setModel(modeloTabla);
            JTableHeader tableHeader = tablaReserva.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            TableColumn tableColumn = tableColumnModel.getColumn(0);
            tableColumn.setHeaderValue("estado");
            TableColumn tableColumn1 = tableColumnModel.getColumn(1);
            tableColumn1.setHeaderValue("Huesped");
            TableColumn tableColumn2 = tableColumnModel.getColumn(2);
            tableColumn2.setHeaderValue("Habitacion");
            TableColumn tableColumn3 = tableColumnModel.getColumn(3);
            tableColumn3.setHeaderValue("Tipo de Habitacion");
            TableColumn tableColumn4 = tableColumnModel.getColumn(4);
            tableColumn4.setHeaderValue("Ingreso");
            TableColumn tableColumn5 = tableColumnModel.getColumn(5);
            tableColumn5.setHeaderValue("Egreso");
            TableColumn tableColumn6 = tableColumnModel.getColumn(6);
            tableColumn6.setHeaderValue("Total");
            float[] anchoColumnaPorcentaje = {0.0757f, 0.1915f, 0.1000f, 0.2050f, 0.1244f, 0.1244f, 0.1464f};
            resizeColumns(anchoColumnaPorcentaje);
            tableHeader.repaint();
        }
        tablaReserva.setRowHeight(28);
        tablaReserva.setDefaultEditor(Object.class, null);
    }

    private void cargarTabla(LocalDate ingreso, LocalDate egreso, Habitacion habi) {
        modeloTabla.addRow(new Object[]{habi.getidHabitacion(), habi.gettipoHabitacion().getNombre(),
            habi.gettipoHabitacion().getCantCamas(), ABMR.calcularPrecioEstadia(ingreso, egreso, habi)});
    }

    private void cargarTablaR(Reserva res) {
        String estado;
        if (res.isEstado()) {
            estado = "activa";
        } else {
            estado = "inactiva";
        }
        String huesped = "<html><div align=center>" + res.getHuesped().getNombre() + " " + res.getHuesped().getApellido();
        String tipoH = "<html><div align=center>" + res.getHabitacion().gettipoHabitacion().getNombre();
        if (titulo.getText().equals("Gestión Reserva")) {
            modeloTabla.addRow(new Object[]{res.getIdReserva(), huesped, res.getHabitacion().getidHabitacion(),
                tipoH, res.getFechaEntrada(), res.getFechaSalida(), res.getImporteTotal()});
        } else {
            modeloTabla.addRow(new Object[]{estado, huesped, res.getHabitacion().getidHabitacion(),
                tipoH, res.getFechaEntrada(), res.getFechaSalida(), res.getImporteTotal()});
        }
    }

    private void limpiarT() {
        int tamaño = tablaReserva.getRowCount();
        if (tamaño != -1) {
            for (int i = tamaño - 1; i >= 0; i--) {
                modeloTabla.removeRow(i);
            }
        }
    }

    private boolean comprobarFechas(LocalDate ingreso, LocalDate egreso) {
        return egreso.isAfter(ingreso);
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

    private void redondearCajasDeTexto() {
        TextoDNI.putClientProperty("JComponent.roundRect", true);
        textoCantPers.putClientProperty("JComponent.roundRect", true);
    }

    private boolean verificarDni() {
        return TextoDNI.getText().matches("[0-9]*") && TextoDNI.getText().length() < 11 && TextoDNI.getText().length() > 6;
    }

    private boolean verificarHuesped() {
        return textoCantPers.getText().matches("[1-6]") && textoCantPers.getText().length() == 1;
    }

    private boolean verificarFechas() {
        try {
            LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate hoy = LocalDate.now();
            return (comprobarFechas(ingreso, egreso) && (hoy.isBefore(ingreso) || hoy.isEqual(ingreso)));
        } catch (NullPointerException e) {
            return false;
        }
    }

    private boolean verificarAunMasFechas() {
        try {
            Reserva res = ABMR.buscarPorId((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0));
            LocalDate ingresoActual = res.getFechaEntrada();
            LocalDate hoy = LocalDate.now();
            LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if ((ingresoActual.equals(ingreso) || hoy.isBefore(ingresoActual)) && egreso.isAfter(hoy)) {
                return verificarFechas();
            } else {
                return false;
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private void activarDesactivarBuscarDni() {
        if (verificarDni()) {
            BotonBuscarDni.setEnabled(true);
        } else {
            BotonBuscarDni.setEnabled(false);
        }
    }

    private void activarDesactivarBuscarHabi() {
        if (verificarHuesped() && verificarFechas()) {
            botonBuscar.setEnabled(true);
        } else {
            botonBuscar.setEnabled(false);
        }
    }

    private void activarDesactivarNuevo() {
        if (verificarDni() && verificarHuesped() && verificarFechas()
                && tablaReserva.getSelectedRow() != -1 && RHabitaciones.isSelected()) {
            botonNueva.setEnabled(true);
        } else {
            botonNueva.setEnabled(false);
        }
    }

    private void activarDesactivarModificar() {
        if (titulo.getText().equals("Gestión Reserva")) {
            if (verificarHuesped() && verificarAunMasFechas() && tablaReserva.getSelectedRow() != -1
                    && RReservas.isSelected()) {
                botonModificar.setEnabled(true);
            } else {
                botonModificar.setEnabled(false);
            }
        } else {
            botonModificar.setEnabled(false);
        }
    }

    private void activarDesactivarCancelar() {
        if (RReservas.isSelected() && tablaReserva.getSelectedRow() != -1) {
            botonCancelar.setEnabled(true);
        } else {
            botonCancelar.setEnabled(false);
        }
    }

    private void textoFechasNoEditable() {
        JTextFieldDateEditor textoIngreso = (JTextFieldDateEditor) jDFechaIngreso.getDateEditor();
        textoIngreso.setEditable(false);
        JTextFieldDateEditor textoEgreso = (JTextFieldDateEditor) jDFechaEgreso.getDateEditor();
        textoEgreso.setEditable(false);
    }

    private void centralizar() {
        centrado.setHorizontalAlignment(JLabel.CENTER);
        centrado.setVerticalAlignment(JLabel.CENTER);
        for (int columna = 0; columna < tablaReserva.getColumnCount(); columna++) {
            tablaReserva.getColumnModel().getColumn(columna).setCellRenderer(centrado);
        }
    }

    private void actualizaAltoFilas() {
        for (int fila = 0; fila < tablaReserva.getRowCount(); fila++) {
            int altoFilaOriginal = tablaReserva.getRowHeight();
            int altoFila = altoFilaOriginal;
            String texto = (String) tablaReserva.getValueAt(fila, 1);
            int largoTexto = texto.length()-24;
            Component comp = (Component) tablaReserva.prepareRenderer(centrado, fila, 1);
            altoFila = Math.max(altoFila, comp.getPreferredSize().height);
            centrado.setVerticalAlignment(JLabel.TOP);
            if (largoTexto > 17) {
                if (largoTexto > 31) {
                    altoFila = altoFila * 3;
                } else {
                    altoFila = altoFila * 2;
                }
            }
            tablaReserva.setRowHeight(fila, altoFila);
        }
    }

    private void resizeColumns(float[] anchoColuPorcen) {
        TableColumn column;
        TableColumnModel jTableColumnModel = tablaReserva.getColumnModel();
        int tW = jTableColumnModel.getTotalColumnWidth();
        int cantCols = jTableColumnModel.getColumnCount();
        for (int i = 0; i < cantCols; i++) {
            column = jTableColumnModel.getColumn(i);
            int pWidth = Math.round(anchoColuPorcen[i] * tW);
            column.setPreferredWidth(pWidth);
        }
    }
}
