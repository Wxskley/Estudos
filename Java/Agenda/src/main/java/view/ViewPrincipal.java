package view;

import javax.swing.JDialog;
import view.agenda.ViewTelaCadastroAgenda;
import view.agenda.ViewTelaListagemAgenda;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnCadastrarCompromisso = new javax.swing.JMenuItem();
        mnListarCompromisso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setIconImages(null);

        label1.setName(""); // NOI18N
        label1.setText("Sistema de Agenda desenvolvido por Weskley");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24-horas.png"))); // NOI18N

        jMenu1.setText("Abrir");

        jMenu2.setText("Compromissos");

        mnCadastrarCompromisso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnCadastrarCompromisso.setText("Cadastrar Compromisso");
        mnCadastrarCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarCompromissoActionPerformed(evt);
            }
        });
        jMenu2.add(mnCadastrarCompromisso);

        mnListarCompromisso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnListarCompromisso.setText("Listar Compromissos");
        mnListarCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarCompromissoActionPerformed(evt);
            }
        });
        jMenu2.add(mnListarCompromisso);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarCompromissoActionPerformed
        formOpen(new ViewTelaCadastroAgenda());
    }//GEN-LAST:event_mnCadastrarCompromissoActionPerformed

    private void mnListarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarCompromissoActionPerformed
        formOpen(new ViewTelaListagemAgenda());
    }//GEN-LAST:event_mnListarCompromissoActionPerformed
    private void formOpen(JDialog form) {
        form.setModal(true);
        form.setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.Label label1;
    private javax.swing.JMenuItem mnCadastrarCompromisso;
    private javax.swing.JMenuItem mnListarCompromisso;
    // End of variables declaration//GEN-END:variables
}
