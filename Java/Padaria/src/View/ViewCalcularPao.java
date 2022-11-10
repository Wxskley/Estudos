package View;

import controller.CalcularPao;

/**
 *
 * @author Weskley
 */
public class ViewCalcularPao extends javax.swing.JFrame {

    public ViewCalcularPao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btBotao = new javax.swing.JButton();
        rtFarinha = new javax.swing.JLabel();
        rtSal = new javax.swing.JLabel();
        rtAcucar = new javax.swing.JLabel();
        rtFermento = new javax.swing.JLabel();
        rtOvo = new javax.swing.JLabel();
        rtMargarina = new javax.swing.JLabel();
        rtAgua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Quantos pães deseja?");

        btBotao.setText("Calcular");
        btBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBotaoActionPerformed(evt);
            }
        });

        rtFarinha.setText("Farinha de trigo");

        rtSal.setText("Sal");

        rtAcucar.setText("Açucar");

        rtFermento.setText("Fermento");

        rtOvo.setText("Ovos");

        rtMargarina.setText("Margarina");

        rtAgua.setText("Água gelada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rtAgua)
                    .addComponent(rtMargarina)
                    .addComponent(rtOvo)
                    .addComponent(rtFermento)
                    .addComponent(rtAcucar)
                    .addComponent(rtSal)
                    .addComponent(rtFarinha)
                    .addComponent(btBotao)
                    .addComponent(ctQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtFarinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtAcucar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtFermento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtOvo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtMargarina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtAgua)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBotaoActionPerformed
        double quantidade = Double.parseDouble(ctQuantidade.getText());
        CalcularPao calcPao = new CalcularPao();
        rtFarinha.setText(String.valueOf(calcPao.getQuantidadeFarinhaTrigo(quantidade)));
        rtSal.setText(String.valueOf(calcPao.getQuantidadeSal(quantidade)));
        rtAcucar.setText(String.valueOf(calcPao.getQuantidadeAcucar(quantidade)));
        rtFermento.setText(String.valueOf(calcPao.getQuantidadeFermento(quantidade)));
        rtOvo.setText(String.valueOf(calcPao.getQuantidadeOvo(quantidade)));
        rtMargarina.setText(String.valueOf(calcPao.getQuantidadeMargarina(quantidade)));
        rtAgua.setText(String.valueOf(calcPao.getQuantidadeAgua(quantidade)));
    }//GEN-LAST:event_btBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCalcularPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalcularPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalcularPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalcularPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBotao;
    private javax.swing.JTextField ctQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel rtAcucar;
    private javax.swing.JLabel rtAgua;
    private javax.swing.JLabel rtFarinha;
    private javax.swing.JLabel rtFermento;
    private javax.swing.JLabel rtMargarina;
    private javax.swing.JLabel rtOvo;
    private javax.swing.JLabel rtSal;
    // End of variables declaration//GEN-END:variables
}
