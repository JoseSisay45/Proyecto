/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal1;

/**
 *
 * @author JOSE
 */
import javax.swing.JFileChooser;
import java.io.File;

public class musicaventana extends javax.swing.JFrame {

   
    public musicaventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rutaincial = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        anterior = new javax.swing.JButton();
        reproducir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        pausa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        dublicados = new javax.swing.JButton();
        karaoke = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rutaincial.setText("Ruta Inicial");
        rutaincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaincialActionPerformed(evt);
            }
        });
        getContentPane().add(rutaincial);
        rutaincial.setBounds(40, 40, 110, 20);

        jTextField1.setText("____________________________________");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 40, 190, 22);

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior);
        anterior.setBounds(50, 120, 73, 23);

        reproducir.setText("Reproducir");
        reproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirActionPerformed(evt);
            }
        });
        getContentPane().add(reproducir);
        reproducir.setBounds(140, 120, 100, 23);

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente);
        siguiente.setBounds(250, 120, 100, 23);

        pausa.setText("Pausa");
        getContentPane().add(pausa);
        pausa.setBounds(160, 160, 72, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Artista", "Album", "Duracion", "Peso D Music", "Año Public"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 500, 120);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(30, 370, 72, 23);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(130, 370, 73, 23);

        dublicados.setText("Duplicados");
        dublicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dublicadosActionPerformed(evt);
            }
        });
        getContentPane().add(dublicados);
        dublicados.setBounds(220, 370, 90, 23);

        karaoke.setText("Karaoke");
        karaoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karaokeActionPerformed(evt);
            }
        });
        getContentPane().add(karaoke);
        karaoke.setBounds(320, 370, 72, 23);

        jLabel2.setText("Lista de musica");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 30, 90, 20);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(530, 70, 170, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaincialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaincialActionPerformed
       // Crear un JFileChooser para seleccionar una carpeta
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Solo permite seleccionar directorios

    // Mostrar el diálogo y verificar si el usuario seleccionó una carpeta
    int returnValue = chooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        // Obtener la ruta seleccionada
        File selectedFile = chooser.getSelectedFile();
        // Mostrar la ruta en el JTextField
        jTextField1.setText(selectedFile.getAbsolutePath());
    }
              
    }//GEN-LAST:event_rutaincialActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
      
    }//GEN-LAST:event_anteriorActionPerformed

    private void reproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirActionPerformed
      // Aquí irá la lógica para reproducir una canción
        System.out.println("Botón Reproducir presionado");
        
    }//GEN-LAST:event_reproducirActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        
        
    }//GEN-LAST:event_siguienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       
    }//GEN-LAST:event_eliminarActionPerformed

    private void dublicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dublicadosActionPerformed
       
        
    }//GEN-LAST:event_dublicadosActionPerformed

    private void karaokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karaokeActionPerformed
       
        
    }//GEN-LAST:event_karaokeActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicaventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton anterior;
    private javax.swing.JButton dublicados;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton karaoke;
    private javax.swing.JButton pausa;
    private javax.swing.JButton reproducir;
    private javax.swing.JButton rutaincial;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
