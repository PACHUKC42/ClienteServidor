/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pachu
 */
public class ClienteEl extends javax.swing.JFrame {
    private String datos[] = new String[7];
    private String datos1[] = new String[100];
    /**
     * Creates new form ClienteC
     */
    private boolean verCampo = false;
    public ClienteEl() {
        initComponents();

        lista.removeAllItems();
        Conexion conx = new Conexion();
        conx.conectar();
        String[] valores = {"clave_cliente"};
        this.datos1=(conx.llenarCliente(valores));
        for(int i = 0; i<datos1.length; i++){
           if("".equals(datos1[i]) || "y".equals(datos1[i])){
               break;
           }
           else{
               lista.addItem(String.valueOf(datos1[i]));
           }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Apem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Calle = new javax.swing.JTextField();
        Numc = new javax.swing.JTextField();
        Colonia = new javax.swing.JTextField();
        Numt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Apep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lista = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(Apem);
        Apem.setBounds(622, 308, 295, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Número de teléfono:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(392, 567, 163, 22);
        getContentPane().add(Calle);
        Calle.setBounds(622, 366, 295, 37);

        Numc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumcKeyTyped(evt);
            }
        });
        getContentPane().add(Numc);
        Numc.setBounds(622, 433, 295, 34);
        getContentPane().add(Colonia);
        Colonia.setBounds(622, 500, 295, 33);

        Numt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumtKeyTyped(evt);
            }
        });
        getContentPane().add(Numt);
        Numt.setBounds(622, 562, 295, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Id del Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(444, 122, 111, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(421, 250, 134, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setText("Eliminar Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 13, 271, 48);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(417, 311, 138, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 620, 161, 51);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Calle:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(512, 371, 43, 22);
        getContentPane().add(Nombre);
        Nombre.setBounds(622, 186, 295, 32);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Número de casa:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(422, 437, 133, 22);
        getContentPane().add(Apep);
        Apep.setBounds(622, 246, 295, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Colonia:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(491, 503, 64, 22);

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(745, 102, 172, 56);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nombre(s):");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(475, 189, 90, 22);

        ID.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(ID);
        ID.setBounds(622, 102, 116, 56);

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 620, 161, 51);

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(lista);
        lista.setBounds(935, 115, 135, 41);

        jLabel10.setText("Escriba el ID del cliente o seleccionelo de la lista");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(622, 68, 276, 16);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumcKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            JOptionPane.showMessageDialog(rootPane, "Sólo se pueden ingresar números");
            Numc.setText(null);
        }
    }//GEN-LAST:event_NumcKeyTyped

    private void NumtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumtKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            JOptionPane.showMessageDialog(rootPane, "Sólo se pueden ingresar números");
            Numt.setText(null);
        }
    }//GEN-LAST:event_NumtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        camposC();
        if(this.verCampo){
            Conexion conx = new Conexion();
            conx.conectar();
             int id=Integer.parseInt((String) lista.getSelectedItem());
            Cliente eliminacion = new Cliente(id);
            conx.eliminaCliente(eliminacion);
            JOptionPane.showMessageDialog(null, "Datos Eliminados correctamente");
            verCampo=false;
            limpiar();
            conx.desconectar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.lista.getSelectedItem())){
            
            Conexion conx = new Conexion ();
            conx.conectar();
            int id=Integer.parseInt((String) lista.getSelectedItem());
            Cliente cliente = new Cliente(id);
            String[] valores = {"nombrecliente", "apellidopaterno", "apellidomaterno", "calle", "numero", "colonia", "telefono"};
            this.datos = (conx.buscaCliente(cliente, valores));
            this.Nombre.setText(this.datos[0]);
            this.Apep.setText(this.datos[1]);
            this.Apem.setText(this.datos[2]);
            this.Calle.setText(this.datos[3]);
            this.Numc.setText(this.datos[4]);
            this.Colonia.setText(this.datos[5]);
            this.Numt.setText(this.datos[6]);
}else{
    JOptionPane.showMessageDialog(null, "Por favor ingresa una matricula para poder procesar");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        camposC();
        if(this.verCampo){
            Conexion conx = new Conexion();
            conx.conectar();
            int id=Integer.parseInt((String) lista.getSelectedItem());
            Cliente actualizacion = new Cliente(id,this.Nombre.getText(), this.Apep.getText(), this.Apem.getText(), this.Calle.getText(), this.Numc.getText(),
            this.Colonia.getText(),this.Numt.getText());
            conx.modificaCliente(actualizacion);
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
            verCampo=false;
            limpiar();
            conx.desconectar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apem;
    private javax.swing.JTextField Apep;
    private javax.swing.JTextField Calle;
    private javax.swing.JTextField Colonia;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Numc;
    private javax.swing.JTextField Numt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> lista;
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



