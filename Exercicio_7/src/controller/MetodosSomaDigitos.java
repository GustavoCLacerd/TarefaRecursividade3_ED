package controller;

public class MetodosSomaDigitos {

    public int somarDigitos(int n) {
        // Condição de parada: quando o número for menor que 10, retorna ele mesmo
        if (n < 10) {
            return n;
        }
        // Relação de chamada: soma o último dígito com a chamada recursiva para o restante do número
        return (n % 10) + somarDigitos(n / 10);
    }
}