
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal5 extends javax.swing.JFrame {

    /**
     * Creates new form Principal5
     */
     double v[];
     double b[];
    public Principal5() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtCrear = new javax.swing.JButton();
        txtLlenado = new javax.swing.JButton();
        txtLlenarAuto = new javax.swing.JButton();
        txtMostrar = new javax.swing.JButton();
        txtBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRepetidos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inicial"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Números");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 37, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 80));

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("NÚMEROS REPETIDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        txtNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerosKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        txtCrear.setText("Crear");
        txtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearActionPerformed(evt);
            }
        });

        txtLlenado.setText("Llenar Manual");
        txtLlenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlenadoActionPerformed(evt);
            }
        });

        txtLlenarAuto.setText("Llenar Auto");

        txtMostrar.setText("Mostrar");
        txtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarActionPerformed(evt);
            }
        });

        txtBorrar.setText("Borrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLlenado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLlenarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLlenado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLlenarAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBorrar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 160, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Repetido"));

        txtRepetidos.setEditable(false);
        txtRepetidos.setColumns(20);
        txtRepetidos.setRows(5);
        jScrollPane1.setViewportView(txtRepetidos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearActionPerformed
        // TODO add your handling code here:
        int numeros;
        if (txtNumeros.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite los números","ERROR",JOptionPane.ERROR_MESSAGE);
        
        txtNumeros.requestFocusInWindow();
        } else if (Integer.parseInt(txtNumeros.getText().trim())==0){
        JOptionPane.showMessageDialog(this, "El número no puede ser cero","ERROR",JOptionPane.ERROR_MESSAGE);
        txtNumeros.requestFocusInWindow();
        txtNumeros.selectAll();
        
        }else{
        numeros = Integer.parseInt(txtNumeros.getText().trim());
        v= new double [numeros];
        JOptionPane.showMessageDialog (this, "El vector se ha creado exitosamente");
        
        
        }
    }//GEN-LAST:event_txtCrearActionPerformed

    private void txtNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerosKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
          if (!Character.isDigit(c)){
          
          getToolkit().beep();
          evt.consume();
          }
    }//GEN-LAST:event_txtNumerosKeyTyped

    private void txtLlenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlenadoActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i=0; i<v.length; i++) {
        n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+i));
        v[i]=n;
        
        }
    }//GEN-LAST:event_txtLlenadoActionPerformed

    private void txtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarActionPerformed
        // TODO add your handling code here:
        
        double cuenta1=0, numero =0;
        for (int i = 0; i<v.length;i++){
        
            double cuenta2=0;
            
           for (int c = 0; c<v.length;c++){ 
            if (v[i] == v[c]){
            
                cuenta2++;
            }
            if (cuenta2>cuenta1){
            numero = v[i];
            
            cuenta2=cuenta2;
            }
           }
        
        }
        txtRepetidos.setText("El Número que se repite es "+numero);
        
    }//GEN-LAST:event_txtMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtBorrar;
    private javax.swing.JButton txtCrear;
    private javax.swing.JButton txtLlenado;
    private javax.swing.JButton txtLlenarAuto;
    private javax.swing.JButton txtMostrar;
    private javax.swing.JTextField txtNumeros;
    private javax.swing.JTextArea txtRepetidos;
    // End of variables declaration//GEN-END:variables
}
