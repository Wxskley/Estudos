package com.sammet.calhanbeque.controllers;

import com.sammet.calhanbeque.entidade.Veiculo;
import com.sammet.calhanbeque.models.VeiculoModel;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerVeiculo {

    public void addVeiculo(Veiculo v) {
        try {
            new VeiculoModel().salvar(v);
            JOptionPane.showMessageDialog(null, "Veículo Gravado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar: " + e.getMessage());
        }
    }

    public List<Veiculo> getVeiculos() {
        return new VeiculoModel().listaVeiculos();
    }
}
