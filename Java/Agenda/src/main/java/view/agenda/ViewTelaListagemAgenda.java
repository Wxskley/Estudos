package view.agenda;

import controller.ControllerCompromisso;
import entidade.Compromisso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCompromisso;

public class ViewTelaListagemAgenda extends javax.swing.JDialog {

    public ViewTelaListagemAgenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCompromisso = new javax.swing.JTable();
        btCadastroCompromisso = new javax.swing.JButton();
        btEditarCompromisso = new javax.swing.JButton();
        btExcluirCompromisso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbCompromisso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbCompromisso);

        btCadastroCompromisso.setText("Cadastro");
        btCadastroCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroCompromissoActionPerformed(evt);
            }
        });

        btEditarCompromisso.setText("Editar");
        btEditarCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCompromissoActionPerformed(evt);
            }
        });

        btExcluirCompromisso.setText("Excluir");
        btExcluirCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCompromissoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastroCompromisso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarCompromisso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluirCompromisso))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastroCompromisso)
                    .addComponent(btEditarCompromisso)
                    .addComponent(btExcluirCompromisso))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carregarCompromisso();
    }//GEN-LAST:event_formWindowActivated

    private void btCadastroCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroCompromissoActionPerformed
        ViewTelaCadastroAgenda tca = new ViewTelaCadastroAgenda();
        tca.setModal(true);
        tca.setVisible(true);
    }//GEN-LAST:event_btCadastroCompromissoActionPerformed

    private void btEditarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCompromissoActionPerformed
        if (tbCompromisso.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum registro");
        } else {
            ViewTelaCadastroAgenda tca = new ViewTelaCadastroAgenda();
            tca.c.setId((Long) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 0));
            tca.c.setDescricao((String) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 1));
            tca.c.setTipo((String) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 2));
            tca.c.setHora((String) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 3));
            tca.c.setDataCompromisso((String) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 4));
            tca.status = "alterar";
            tca.setTitle("Alteração de Compromisso");
            tca.setModal(true);
            tca.setVisible(true);
        }
    }//GEN-LAST:event_btEditarCompromissoActionPerformed

    private void btExcluirCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCompromissoActionPerformed
        if (tbCompromisso.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum registro");
        } else {
            if (JOptionPane.showConfirmDialog(rootPane, "Confirma a exclusão do compromisso") == 0) {
                new ModelCompromisso().excluir((Long) tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_btExcluirCompromissoActionPerformed
    private void carregarCompromisso() {
        try {
            tbCompromisso.setModel(new DefaultTableModel(
                    new Object[][]{}, new String[]{"Código", "Descrição", "Tipo", "Hora", "Data"}));
            DefaultTableModel rows = (DefaultTableModel) tbCompromisso.getModel();
            for (Compromisso c : new ControllerCompromisso().getCompromisso()) {
                rows.addRow(new Object[]{c.getId(), c.getDescricao(), c.getTipo(), c.getHora(), c.getDataCompromisso()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Falha ao carregar os dados: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTelaListagemAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroCompromisso;
    private javax.swing.JButton btEditarCompromisso;
    private javax.swing.JButton btExcluirCompromisso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCompromisso;
    // End of variables declaration//GEN-END:variables
}
