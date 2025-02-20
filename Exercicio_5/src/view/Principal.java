package view;

import javax.swing.JOptionPane;
import controller.MetodosFibonacci;

public class Principal {
    public static void main(String[] args) {
        MetodosFibonacci metodos = new MetodosFibonacci();

        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da série de Fibonacci (até 20):"));

        if (posicao < 1 || posicao > 20) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número entre 1 e 20.");
        } else {
            int resultado = metodos.calcularFibonacci(posicao);
            JOptionPane.showMessageDialog(null, "O termo " + posicao + " da série de Fibonacci é: " + resultado);
        }
    }
}
