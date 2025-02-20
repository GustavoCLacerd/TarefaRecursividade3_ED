package view;

import javax.swing.JOptionPane;
import controller.MetodosSomatoria;

public class Principal {
    public static void main(String[] args) {
        MetodosSomatoria metodos = new MetodosSomatoria();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo para calcular a somatória:"));

        if (n < 1) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número maior ou igual a 1.");
        } else {
            double resultado = metodos.calcularSomatoria(n);
            JOptionPane.showMessageDialog(null, "O resultado da somatória para N = " + n + " é: " + resultado);
        }
    }
}
