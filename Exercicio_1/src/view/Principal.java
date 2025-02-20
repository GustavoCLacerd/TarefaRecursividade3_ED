package view;

import controller.MetodosContarDigitos;

public class Principal {
    public static void main(String[] args) {
        MetodosContarDigitos metodos = new MetodosContarDigitos();
        
        int numero = 12345; // Exemplo de número
        int quantidadeDigitos = metodos.contarDigitos(numero);
        
        System.out.println("A quantidade de dígitos de " + numero + " é: " + quantidadeDigitos);
    }
}
