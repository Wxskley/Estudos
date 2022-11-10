package controller;

import entidade.Veiculo;
import java.util.List;
import javax.swing.JOptionPane;
import model.VeiculoModel;

public class ControllerVeiculo {

    public void addVeiculo(Veiculo v) {
        try {
            new VeiculoModel().salvar(v);
            JOptionPane.showMessageDialog(null, "Veículo gravado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar" + e.getMessage());
        }
    }

    public List<Veiculo> getVeiculos() {
        return new VeiculoModel().listaVeiculos();
    }
}
