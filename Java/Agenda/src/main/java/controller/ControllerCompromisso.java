package controller;

import entidade.Compromisso;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelCompromisso;

public class ControllerCompromisso {

    public void adicionarCompromisso(Compromisso c) {
        try {
            new ModelCompromisso().salvar(c);
            JOptionPane.showMessageDialog(null, "Compromisso salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum problema ao salvar" + e.getMessage());
        }
    }

    public List<Compromisso> getCompromisso() {
        return new ModelCompromisso().listarCompromisso();
    }
}
