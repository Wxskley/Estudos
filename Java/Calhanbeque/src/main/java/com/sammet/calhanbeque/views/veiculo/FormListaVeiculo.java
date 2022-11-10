package com.sammet.calhanbeque.views.veiculo;

import com.sammet.calhanbeque.controllers.ControllerVeiculo;
import com.sammet.calhanbeque.entidade.Veiculo;
import com.sammet.calhanbeque.models.VeiculoModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormListaVeiculo extends javax.swing.JDialog {

    public FormListaVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbVeiculos = new javax.swing.JTable();
        btCadVeiculo = new javax.swing.JButton();
        btAlterarVeiculo = new javax.swing.JButton();
        btExcluirVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem dos Veículos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbVeiculos);

        btCadVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadVeiculoActionPerformed(evt);
            }
        });

        btAlterarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btAlterarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarVeiculoActionPerformed(evt);
            }
        });

        btExcluirVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadVeiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterarVeiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirVeiculo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterarVeiculo)
                    .addComponent(btCadVeiculo)
                    .addComponent(btExcluirVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carregarVeiculos();
    }//GEN-LAST:event_formWindowActivated

    private void btCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadVeiculoActionPerformed
        FormCadastro fc = new FormCadastro();
        fc.setModal(true);
        fc.setVisible(true);
    }//GEN-LAST:event_btCadVeiculoActionPerformed

    private void btExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirVeiculoActionPerformed

        if (tbVeiculos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum registro");
        } else {
            if (JOptionPane.showConfirmDialog(rootPane, "Confirma a exclusão do veículo") == 0) {
                new VeiculoModel().excluir((Long) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_btExcluirVeiculoActionPerformed

    private void btAlterarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarVeiculoActionPerformed
        if (tbVeiculos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum registro");
        } else {
            FormCadastro fc = new FormCadastro();
            fc.v.setId((Long) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 0));
            fc.v.setModelo((String) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 1));
            fc.v.setFabricante((String) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 2));
            fc.v.setAno((Integer) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3));
            fc.v.setPreco((Double) tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 4));
            fc.status = "alterar";
            fc.setTitle("Alteração de Veículo");
            fc.setModal(true);
            fc.setVisible(true);
        }
    }//GEN-LAST:event_btAlterarVeiculoActionPerformed

    private void carregarVeiculos() {
        try {
            tbVeiculos.setModel(new DefaultTableModel(
                    new Object[][]{}, new String[]{"Código", "Modelo", "Fabricante", "Ano", "Valor"}));
            DefaultTableModel rows = (DefaultTableModel) tbVeiculos.getModel();
            for (Veiculo v : new ControllerVeiculo().getVeiculos()) {
                rows.addRow(new Object[]{v.getId(), v.getModelo(), v.getFabricante(), v.getAno(), v.getPreco()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar os dados: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarVeiculo;
    private javax.swing.JButton btCadVeiculo;
    private javax.swing.JButton btExcluirVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVeiculos;
    // End of variables declaration//GEN-END:variables
}
