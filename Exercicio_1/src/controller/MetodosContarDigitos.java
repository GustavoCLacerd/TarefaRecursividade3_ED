package controller;

public class MetodosContarDigitos {

    public int contarDigitos(int numero) {
        // Condição de parada: se o número for 0, retorna 0
        if (numero == 0) {
            return 0;
        }
        // Chama a função para o termo n em função do termo anterior
        // Adiciona 1 ao resultado da chamada recursiva com o número dividido por 10
        return 1 + contarDigitos(numero / 10);
    }
}