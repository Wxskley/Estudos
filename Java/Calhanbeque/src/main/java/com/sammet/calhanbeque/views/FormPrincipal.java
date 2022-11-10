package com.sammet.calhanbeque.views;

import com.sammet.calhanbeque.views.veiculo.FormCadastro;
import com.sammet.calhanbeque.views.veiculo.FormListaVeiculo;
import javax.swing.JDialog;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnAbrir = new javax.swing.JMenu();
        mnAbrirVeiculos = new javax.swing.JMenu();
        mnAbrirVeiculosCadastro = new javax.swing.JMenuItem();
        mnAbrirVeiculosLista = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Veículos");

        mnAbrir.setText("Abrir");

        mnAbrirVeiculos.setText("Veículos");

        mnAbrirVeiculosCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnAbrirVeiculosCadastro.setText("Cadastro");
        mnAbrirVeiculosCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAbrirVeiculosCadastroActionPerformed(evt);
            }
        });
        mnAbrirVeiculos.add(mnAbrirVeiculosCadastro);

        mnAbrirVeiculosLista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnAbrirVeiculosLista.setText("Lista");
        mnAbrirVeiculosLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAbrirVeiculosListaActionPerformed(evt);
            }
        });
        mnAbrirVeiculos.add(mnAbrirVeiculosLista);

        mnAbrir.add(mnAbrirVeiculos);

        jMenuBar1.add(mnAbrir);

        mnSistema.setText("Sistema");
        jMenuBar1.add(mnSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnAbrirVeiculosCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAbrirVeiculosCadastroActionPerformed
        formOpen(new FormCadastro());
    }//GEN-LAST:event_mnAbrirVeiculosCadastroActionPerformed

    private void mnAbrirVeiculosListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAbrirVeiculosListaActionPerformed
        formOpen(new FormListaVeiculo());
    }//GEN-LAST:event_mnAbrirVeiculosListaActionPerformed
    private void formOpen(JDialog form) {
        form.setModal(true);
        form.setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAbrir;
    private javax.swing.JMenu mnAbrirVeiculos;
    private javax.swing.JMenuItem mnAbrirVeiculosCadastro;
    private javax.swing.JMenuItem mnAbrirVeiculosLista;
    private javax.swing.JMenu mnSistema;
    // End of variables declaration//GEN-END:variables
}
