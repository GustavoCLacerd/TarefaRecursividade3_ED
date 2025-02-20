package controller;

public class MetodosInverterString {

    public String inverterString(String str) {
        // Condição de parada: se a string estiver vazia ou tiver apenas um caractere, retorna a própria string
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Relação de chamada: pega o último caractere e chama a função recursivamente com o restante da string
        return str.substring(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }
}