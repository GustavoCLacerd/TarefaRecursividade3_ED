package view;

import javax.swing.JOptionPane;
import controller.MetodosContarOcorrencias;

public class Principal {
    public static void main(String[] args) {
        MetodosContarOcorrencias metodos = new MetodosContarOcorrencias();

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 10 e 999999:"));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Digite um dígito (0 a 9):"));

        if (numero < 10 || numero > 999999 || digito < 0 || digito > 9) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, siga os limites especificados.");
        } else {
            int quantidadeOcorrencias = metodos.contarOcorrencias(numero, digito);
            JOptionPane.showMessageDialog(null, "O dígito " + digito + " aparece " + quantidadeOcorrencias + " vez(es) no número " + numero + ".");
        }
    }
}
