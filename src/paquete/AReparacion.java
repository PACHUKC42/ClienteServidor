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
public class AReparacion extends javax.swing.JFrame {
private String datos[] = new String[5];
private String datos1[] = new String[100];
private boolean verCampo = false;
    /**
     * Creates new form eReparacion
     */
    public AReparacion() {
        initComponents();
        lista.removeAllItems();
        Conexion conx = new Conexion();
        conx.conectar();
        String[] valores = {"clave_revision"};
        this.datos1=(conx.llenarReparacion(valores));
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

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lista = new javax.swing.JComboBox<>();
        dur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diag = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        acc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ceq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Clave del equipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(447, 194, 136, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(542, 511, 41, 22);

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(lista);
        lista.setBounds(601, 126, 124, 41);
        getContentPane().add(dur);
        dur.setBounds(601, 567, 262, 36);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Diagnostico:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(486, 275, 97, 22);

        diag.setColumns(20);
        diag.setRows(5);
        jScrollPane1.setViewportView(diag);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(601, 246, 262, 96);

        acc.setColumns(20);
        acc.setRows(5);
        jScrollPane2.setViewportView(acc);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(601, 373, 262, 96);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Acciones a realizar:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(433, 406, 150, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Duración aproximada de la reparación:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 572, 303, 22);
        getContentPane().add(tipo);
        tipo.setBounds(601, 497, 262, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Clave de reparación:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(423, 133, 160, 22);
        getContentPane().add(ceq);
        ceq.setBounds(601, 185, 262, 43);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setText("Editar reparación");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 50, 297, 48);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(611, 616, 159, 56);

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(737, 124, 126, 43);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 0, 1260, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        camposC();
        if(this.verCampo){
            Conexion conx = new Conexion();
            conx.conectar();
            int id=Integer.parseInt((String) lista.getSelectedItem());
            int id2= Integer.parseInt((String) ceq.getText());
            Reparacion actualizacion = new Reparacion(id,id2,diag.getText(),acc.getText(), tipo.getText(), dur.getText());
            conx.modificaReparacion(actualizacion);
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
            verCampo=false;
            limpiar();
            conx.desconectar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.lista.getSelectedItem())){
            
            Conexion conx = new Conexion ();
            conx.conectar();
            int id=Integer.parseInt((String) lista.getSelectedItem());
            Reparacion reparacion = new Reparacion(id);
            String[] valores = {"clave_equipo", "diagnostico", "acciones", "tipo", "duracion"};
            this.datos = (conx.buscaReparacion(reparacion, valores));
            this.ceq.setText(this.datos[0]);
            this.diag.setText(this.datos[1]);
            this.acc.setText(this.datos[2]);
            this.tipo.setText(this.datos[3]);
            this.dur.setText(this.datos[4]);
}else{
    JOptionPane.showMessageDialog(null, "Por favor ingresa una matricula para poder procesar");
}
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acc;
    private javax.swing.JTextField ceq;
    private javax.swing.JTextArea diag;
    private javax.swing.JTextField dur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
 public void camposC() {
        if (!"".equals(this.diag.getText()) && !"".equals(this.acc.getText()) && !"".equals(this.tipo.getText()) && !"".equals(this.dur.getText())) {
            this.verCampo = true;
        } else {
            this.verCampo = false;
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios");

        }
    }
    
    public void limpiar(){
        this.ceq.setText(null);
        this.diag.setText(null);
        this.acc.setText(null);
        this.tipo.setText(null);
        this.dur.setText(null);

    
    }
}
