/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.buses;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author david
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearparada = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        parada_nombre = new javax.swing.JTextField();
        parada_distancia = new javax.swing.JTextField();
        parada_angulo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jd_crearestudiante = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        cb_paradas = new javax.swing.JComboBox<>();
        estudiante_nombre = new javax.swing.JTextField();
        estudiante_edad = new javax.swing.JSpinner();
        estudiante_numcuenta = new javax.swing.JTextField();
        jd_busess = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buses_id = new javax.swing.JTextField();
        buses_placa = new javax.swing.JTextField();
        buses_color = new javax.swing.JTextField();
        buses_velocidad = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jd_agregarestu = new javax.swing.JDialog();
        cb_estudiantesagregar = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jb_crearestudiantes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jb_sim = new javax.swing.JButton();
        cb_buses = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jb_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        progressbar = new javax.swing.JProgressBar();

        jLabel2.setText("nombre");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("Crear Parada");

        jLabel4.setText("distancia");

        jLabel5.setText("Angulo");

        jButton4.setText("crear parada");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearparadaLayout = new javax.swing.GroupLayout(jd_crearparada.getContentPane());
        jd_crearparada.getContentPane().setLayout(jd_crearparadaLayout);
        jd_crearparadaLayout.setHorizontalGroup(
            jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearparadaLayout.createSequentialGroup()
                .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearparadaLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3))
                    .addGroup(jd_crearparadaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(parada_nombre)
                            .addComponent(parada_distancia, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(parada_angulo))))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearparadaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );
        jd_crearparadaLayout.setVerticalGroup(
            jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearparadaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parada_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(parada_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_crearparadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(parada_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jLabel6.setText("nombre");

        jLabel7.setText("edad");

        jLabel8.setText("numero de cuenta");

        jLabel9.setText("parada");

        jButton5.setText("crear estudiante");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        cb_paradas.setModel(new DefaultComboBoxModel());

        estudiante_edad.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        javax.swing.GroupLayout jd_crearestudianteLayout = new javax.swing.GroupLayout(jd_crearestudiante.getContentPane());
        jd_crearestudiante.getContentPane().setLayout(jd_crearestudianteLayout);
        jd_crearestudianteLayout.setHorizontalGroup(
            jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearestudianteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jd_crearestudianteLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(64, 64, 64)
                            .addComponent(cb_paradas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_crearestudianteLayout.createSequentialGroup()
                            .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_crearestudianteLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearestudianteLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(122, 122, 122)))
                            .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(estudiante_nombre)
                                .addComponent(estudiante_numcuenta)
                                .addComponent(estudiante_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearestudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jd_crearestudianteLayout.setVerticalGroup(
            jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearestudianteLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(estudiante_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(estudiante_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(estudiante_numcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jd_crearestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_paradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jLabel10.setText("ID");

        jLabel11.setText("Placa");

        jLabel12.setText("Color");

        jLabel13.setText("Velocidad (KM/H)");

        buses_velocidad.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        jButton1.setText("crear bus");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_busessLayout = new javax.swing.GroupLayout(jd_busess.getContentPane());
        jd_busess.getContentPane().setLayout(jd_busessLayout);
        jd_busessLayout.setHorizontalGroup(
            jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_busessLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buses_id)
                    .addComponent(buses_placa)
                    .addComponent(buses_color)
                    .addComponent(buses_velocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_busessLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jd_busessLayout.setVerticalGroup(
            jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_busessLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(buses_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(buses_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(buses_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_busessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(buses_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        cb_estudiantesagregar.setModel(new DefaultComboBoxModel());

        jButton6.setText("agregar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregarestuLayout = new javax.swing.GroupLayout(jd_agregarestu.getContentPane());
        jd_agregarestu.getContentPane().setLayout(jd_agregarestuLayout);
        jd_agregarestuLayout.setHorizontalGroup(
            jd_agregarestuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarestuLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jd_agregarestuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_estudiantesagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jd_agregarestuLayout.setVerticalGroup(
            jd_agregarestuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarestuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cb_estudiantesagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_crearestudiantes.setText("Crear Estudiante");
        jb_crearestudiantes.setEnabled(false);
        jb_crearestudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearestudiantesMouseClicked(evt);
            }
        });

        jButton2.setText("Crear AutoBus");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jb_sim.setText("iniciar simulacion");
        jb_sim.setEnabled(false);
        jb_sim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_simMouseClicked(evt);
            }
        });

        cb_buses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));
        cb_buses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_busesItemStateChanged(evt);
            }
        });

        jLabel1.setText("eliga bus");

        jb_agregar.setText("agregar estudiante");
        jb_agregar.setEnabled(false);
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "tiempo", "Estudiantes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Crear parada");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_sim))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_crearestudiantes)
                        .addGap(79, 79, 79)
                        .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(cb_buses, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jb_agregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jb_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addComponent(jb_crearestudiantes)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cb_buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jb_agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_busesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_busesItemStateChanged
        // TODO add your handling code here:
        if (cb_buses.getSelectedIndex()>0) {
            jb_agregar.setEnabled(true);
            jb_sim.setEnabled(true);
        }
        if (cb_buses.getSelectedIndex()==0) {
            jb_agregar.setEnabled(false);
            jb_sim.setEnabled(false);
        }
    }//GEN-LAST:event_cb_busesItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_crearparada.setModal(true);
        jd_crearparada.pack();
        jd_crearparada.setLocationRelativeTo(this);
        jd_crearparada.setVisible(true);
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        double Angulo=Math.toRadians(Integer.parseInt(parada_angulo.getText()));
        double coordenadax=Integer.parseInt(parada_distancia.getText())*Math.cos(Angulo);
        double coordenaday=Integer.parseInt(parada_distancia.getText())*Math.sin(Angulo);
        DefaultComboBoxModel modelo= (DefaultComboBoxModel) cb_paradas.getModel();
        modelo.addElement(new parada(Integer.parseInt(parada_distancia.getText()), Angulo, coordenadax, coordenaday));
        cb_paradas.setModel(modelo);
        jb_crearestudiantes.setEnabled(true);
        jd_crearparada.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
   
        estudiantes.add(new estudiante(estudiante_nombre.getText(), 22, Integer.parseInt(estudiante_numcuenta.getText()), ((parada)cb_paradas.getSelectedItem())));
        jd_crearestudiante.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jb_crearestudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearestudiantesMouseClicked
        // TODO add your handling code here:
        jd_crearestudiante.setModal(true);
        jd_crearestudiante.pack();
        jd_crearestudiante.setLocationRelativeTo(this);
        jd_crearestudiante.setVisible(true);
    }//GEN-LAST:event_jb_crearestudiantesMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_busess.setModal(true);
        jd_busess.pack();
        jd_busess.setLocationRelativeTo(this);
        jd_busess.setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modelo= (DefaultComboBoxModel) cb_buses.getModel();
        modelo.addElement(new buses(Integer.parseInt(buses_id.getText()), buses_placa.getText(), buses_color.getText(), ((Double)buses_velocidad.getValue())));
        jd_busess.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        // TODO add your handling code here:
       
        DefaultComboBoxModel modelo=new DefaultComboBoxModel(estudiantes.toArray());
        cb_estudiantesagregar.setModel(modelo);
        jd_agregarestu.setModal(true);
        jd_agregarestu.pack();
        jd_agregarestu.setLocationRelativeTo(this);
        jd_agregarestu.setVisible(true);
    }//GEN-LAST:event_jb_agregarMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        ((buses)cb_buses.getSelectedItem()).getEstu().add((estudiante)(cb_estudiantesagregar.getSelectedItem()));
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jb_simMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_simMouseClicked
        // TODO add your handling code here:
        ab=new administrarbarra(progressbar,jTable1,((buses)cb_buses.getSelectedItem()));
        ab.start();
    }//GEN-LAST:event_jb_simMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buses_color;
    private javax.swing.JTextField buses_id;
    private javax.swing.JTextField buses_placa;
    private javax.swing.JSpinner buses_velocidad;
    private javax.swing.JComboBox<String> cb_buses;
    private javax.swing.JComboBox<String> cb_estudiantesagregar;
    private javax.swing.JComboBox<String> cb_paradas;
    private javax.swing.JSpinner estudiante_edad;
    private javax.swing.JTextField estudiante_nombre;
    private javax.swing.JTextField estudiante_numcuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_crearestudiantes;
    private javax.swing.JButton jb_sim;
    private javax.swing.JDialog jd_agregarestu;
    private javax.swing.JDialog jd_busess;
    private javax.swing.JDialog jd_crearestudiante;
    private javax.swing.JDialog jd_crearparada;
    private javax.swing.JTextField parada_angulo;
    private javax.swing.JTextField parada_distancia;
    private javax.swing.JTextField parada_nombre;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
    administrarbarra ab;
    ArrayList<estudiante> estudiantes=new ArrayList();

}
