package view;

import javax.swing.JOptionPane;
import controller.MetodosSomaDigitos;

public class Principal {
    public static void main(String[] args) {
        MetodosSomaDigitos metodos = new MetodosSomaDigitos();

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro positivo.");
        } else {
            int resultado = metodos.somarDigitos(numero);
            JOptionPane.showMessageDialog(null, "A soma dos dígitos de " + numero + " é: " + resultado);
        }
    }
}