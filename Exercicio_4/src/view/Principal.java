package view;

import javax.swing.JOptionPane;
import controller.MetodosConversao;

public class Principal {
    public static void main(String[] args) {
        MetodosConversao metodos = new MetodosConversao();

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro (até 2000) para converter para binário:"));

        if (numero < 0 || numero > 2000) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número entre 0 e 2000.");
        } else {
            String binario = metodos.converterParaBinario(numero);
            JOptionPane.showMessageDialog(null, "Representação binária de " + numero + ": " + binario);
        }
    }
}