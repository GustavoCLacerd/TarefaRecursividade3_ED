package view;

import javax.swing.JOptionPane;
import controller.MetodosInverterString;

public class Principal {
    public static void main(String[] args) {
        MetodosInverterString metodos = new MetodosInverterString();

        String entrada = JOptionPane.showInputDialog("Digite uma palavra para inverter:");

        if (entrada == null || entrada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite uma palavra.");
        } else {
            String invertida = metodos.inverterString(entrada);
            JOptionPane.showMessageDialog(null, "String invertida: " + invertida);
        }
    }
}