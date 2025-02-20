package controller;

public class MetodosFibonacci {

    public int calcularFibonacci(int n) {
        // Condição de parada: se n for 1 ou 2, retorna 1 (os dois primeiros termos da série são 1)
        if (n == 1 || n == 2) {
            return 1;
        }
        // Relação de chamada: soma os dois termos anteriores da sequência
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}