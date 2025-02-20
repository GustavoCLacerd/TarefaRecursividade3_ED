package controller;

public class MetodosSomatoria {

    public double calcularSomatoria(int n) {
        // Condição de parada: quando N for 1, retorna 1 (primeiro termo da série)
        if (n == 1) {
            return 1.0;
        }
        // Relação de chamada: soma 1/n! com a chamada recursiva para (n-1)
        return (1.0 / calcularFatorial(n)) + calcularSomatoria(n - 1);
    }

    private int calcularFatorial(int num) {
        // Condição de parada: fatorial de 1 é 1
        if (num == 1) {
            return 1;
        }
        // Relação de chamada: num * fatorial de (num - 1)
        return num * calcularFatorial(num - 1);
    }
}