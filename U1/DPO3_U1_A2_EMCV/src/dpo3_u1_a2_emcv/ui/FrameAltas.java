/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpo3_u1_a2_emcv.ui;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrameAltas extends javax.swing.JFrame {
    JFileChooser fc;
    FileNameExtensionFilter filter;

    /**
     * Constructor principal del la ventana de altas.
     */
    public FrameAltas() {
        initComponents();
        fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter(
            "Archivos de text", "txt"));
    }

    /**
     * Método que se encarga de inicializar los componentes de la ventana de altas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonGuardar = new javax.swing.JButton();
        JButtonAbrir = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();
        JLabelEncargado = new javax.swing.JLabel();
        JLabelObra = new javax.swing.JLabel();
        JLabelZona = new javax.swing.JLabel();
        JLabelMetros = new javax.swing.JLabel();
        JLabelFechaEntrega = new javax.swing.JLabel();
        JLabelDepartamento1 = new javax.swing.JLabel();
        JTextFieldLEncargado = new javax.swing.JTextField();
        JTextFieldLObra = new javax.swing.JTextField();
        JTextFieldLZona = new javax.swing.JTextField();
        JTextFieldLMetros = new javax.swing.JTextField();
        JTextFieldLDepartamento = new javax.swing.JTextField();
        JTextFieldLFechaEntrega = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));

        JButtonGuardar.setText("Guardar");
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });

        JButtonAbrir.setText("Abrir");
        JButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAbrirActionPerformed(evt);
            }
        });

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        JLabelEncargado.setText("Encargado");

        JLabelObra.setText("Obra");

        JLabelZona.setText("Zona");

        JLabelMetros.setText("Metros");

        JLabelFechaEntrega.setText("Fecha de entrega");

        JLabelDepartamento1.setText("Departamento");

        JTextFieldLEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLEncargadoActionPerformed(evt);
            }
        });

        JTextFieldLObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLObraActionPerformed(evt);
            }
        });

        JTextFieldLZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLZonaActionPerformed(evt);
            }
        });

        JTextFieldLMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLMetrosActionPerformed(evt);
            }
        });

        JTextFieldLDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLDepartamentoActionPerformed(evt);
            }
        });

        JTextFieldLFechaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLFechaEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelEncargado)
                    .addComponent(JLabelObra)
                    .addComponent(JLabelMetros)
                    .addComponent(JLabelDepartamento1)
                    .addComponent(JLabelZona)
                    .addComponent(JLabelFechaEntrega))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldLDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldLMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldLZona, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldLObra, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JButtonGuardar)
                            .addComponent(JButtonAbrir)
                            .addComponent(JButtonSalir))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldLFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldLEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelEncargado)
                    .addComponent(JTextFieldLEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabelMetros)
                                    .addComponent(JTextFieldLMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabelObra)
                                    .addComponent(JTextFieldLObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabelZona)
                                    .addComponent(JTextFieldLZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelDepartamento1)
                            .addComponent(JTextFieldLDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabelFechaEntrega)
                            .addComponent(JTextFieldLFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JButtonGuardar)
                        .addGap(44, 44, 44)
                        .addComponent(JButtonAbrir)
                        .addGap(56, 56, 56)
                        .addComponent(JButtonSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Listener que se encarga de cerrar la ventana de altas.
     * @param evt
     */
    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JTextFieldLEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLEncargadoActionPerformed

    private void JTextFieldLObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLObraActionPerformed

    private void JTextFieldLZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLZonaActionPerformed

    private void JTextFieldLMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLMetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLMetrosActionPerformed

    private void JTextFieldLDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLDepartamentoActionPerformed

    private void JTextFieldLFechaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLFechaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLFechaEntregaActionPerformed


    /**
     * Listener que se encarga de abrir un archivo de texto y mostrarlo en otra vista.
     * @param evt
     */
    private void JButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JButtonAbrirActionPerformed
        int value = fc.showOpenDialog(FrameAltas.this);

        if (value == JFileChooser.CANCEL_OPTION)
            return;

        int c;
        StringBuffer buffer = new StringBuffer();
        File file = fc.getSelectedFile();
        String fileName = file.getAbsolutePath();

        if (!fileName.endsWith(".txt")) {
            file = new File(fileName + ".txt");
            System.out.println(file.getAbsolutePath());
        }

        try (FileReader inputStream = new FileReader(file)) {
            while ((c = inputStream.read()) != -1) {
                buffer.append((char) c);
            }


            new FrameInformacion(buffer.toString()).setVisible(true);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }// GEN-LAST:event_JButtonAbrirActionPerformed

    /**
     * Listener que se encarga de guardar un archivo de texto con la información de la ventana de altas. Cuando el fichero se ha guardado exitosamente, se muestra un mensaje de confirmación.
     * @param evt
     */
    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JButtonGuardarActionPerformed
        int value = fc.showSaveDialog(FrameAltas.this);

        if (value == JFileChooser.CANCEL_OPTION)
            return;

        String fileName = fc.getSelectedFile().getAbsolutePath();
        String filePath = fileName + (fileName.endsWith(".txt") ? "" : ".txt");
        boolean append = false;

        File helper = new File(filePath);

        if (helper.exists()) {
            append = true;
        }

        try (FileWriter fr = new FileWriter(filePath, append)) {
            String buffer = "";

            fr.write(buffer);

            JOptionPane.showMessageDialog(null, "Trabajador guardado en " + filePath, "Registro guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }// GEN-LAST:event_JButtonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAbrir;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JLabel JLabelDepartamento1;
    private javax.swing.JLabel JLabelEncargado;
    private javax.swing.JLabel JLabelFechaEntrega;
    private javax.swing.JLabel JLabelMetros;
    private javax.swing.JLabel JLabelObra;
    private javax.swing.JLabel JLabelZona;
    private javax.swing.JTextField JTextFieldLDepartamento;
    private javax.swing.JTextField JTextFieldLEncargado;
    private javax.swing.JTextField JTextFieldLFechaEntrega;
    private javax.swing.JTextField JTextFieldLMetros;
    private javax.swing.JTextField JTextFieldLObra;
    private javax.swing.JTextField JTextFieldLZona;
    // End of variables declaration//GEN-END:variables
}
