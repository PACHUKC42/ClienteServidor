/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author pachu
 */
public class ClienteA extends javax.swing.JFrame {

    /**
     * Creates new form ClienteA
     */
    private boolean verCampo = false;
    public ClienteA() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Apep = new javax.swing.JTextField();
        Apem = new javax.swing.JTextField();
        Calle = new javax.swing.JTextField();
        Numc = new javax.swing.JTextField();
        Colonia = new javax.swing.JTextField();
        Numt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setText("Crear Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(528, 13, 226, 48);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 590, 161, 51);
        getContentPane().add(Nombre);
        Nombre.setBounds(622, 131, 295, 32);
        getContentPane().add(Apep);
        Apep.setBounds(622, 191, 295, 34);
        getContentPane().add(Apem);
        Apem.setBounds(622, 253, 295, 32);
        getContentPane().add(Calle);
        Calle.setBounds(622, 311, 295, 37);

        Numc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumcKeyTyped(evt);
            }
        });
        getContentPane().add(Numc);
        Numc.setBounds(622, 378, 295, 34);
        getContentPane().add(Colonia);
        Colonia.setBounds(622, 445, 295, 33);

        Numt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumtKeyTyped(evt);
            }
        });
        getContentPane().add(Numt);
        Numt.setBounds(622, 507, 295, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(465, 134, 90, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(421, 195, 134, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(417, 256, 138, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Calle:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(512, 316, 43, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Número de casa:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(422, 382, 133, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Colonia:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(491, 448, 64, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Número de teléfono:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(392, 512, 163, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumcKeyTyped
        // TODO add your handling code here:
      char validar = evt.getKeyChar();
      if(Character.isLetter(validar)){
        JOptionPane.showMessageDialog(rootPane, "Sólo se pueden ingresar números");
      }
    }//GEN-LAST:event_NumcKeyTyped

    private void NumtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumtKeyTyped
        // TODO add your handling code here:
      char validar = evt.getKeyChar();
      if(Character.isLetter(validar)){
        JOptionPane.showMessageDialog(rootPane, "Sólo se pueden ingresar números");
      }
    }//GEN-LAST:event_NumtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        camposC();
        if(this.verCampo){
            Conexion conx = new Conexion();
            conx.conectar();
            Cliente insercion = new Cliente(this.Nombre.getText(), this.Apep.getText(), this.Apem.getText(), this.Calle.getText(), this.Numc.getText(), 
            this.Colonia.getText(),this.Numt.getText());
            conx.altaCliente(insercion);
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
            verCampo=false;
            limpiar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apem;
    private javax.swing.JTextField Apep;
    private javax.swing.JTextField Calle;
    private javax.swing.JTextField Colonia;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Numc;
    private javax.swing.JTextField Numt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void camposC() {
        if (!"".equals(this.Calle.getText()) && !"".equals(this.Nombre.getText()) && !"".equals(this.Apep.getText()) && !"".equals(this.Apem.getText())
                && !"".equals(this.Numt.getText()) && !"".equals(this.Numc.getText()) && !"".equals(this.Colonia.getText())) {
            this.verCampo = true;
        } else {
            this.verCampo = false;
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios");

        }
    }
    
    public void limpiar(){
    
        this.Nombre.setText(null);
        this.Apep.setText(null);
        this.Apem.setText(null);
        this.Numt.setText(null);
        this.Calle.setText(null);
        this.Numc.setText(null);
        this.Colonia.setText(null);
    
    }



}