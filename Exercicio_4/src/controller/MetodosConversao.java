package controller;

public class MetodosConversao {

    public String converterParaBinario(int numero) {
        // Condição de parada: quando o número for 0 ou 1, retorna ele mesmo como string
        if (numero == 0 || numero == 1) {
            return String.valueOf(numero);
        }
        // Relação de chamada: divide o número por 2 e chama a função recursivamente, concatenando o resto da divisão
        return converterParaBinario(numero / 2) + String.valueOf(numero % 2);
    }
}