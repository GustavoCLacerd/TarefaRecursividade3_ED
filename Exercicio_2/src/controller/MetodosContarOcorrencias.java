package controller;

public class MetodosContarOcorrencias {

    public int contarOcorrencias(int numero, int digito) {
        if (numero == 0) {
            return 0;
        }
        int count = (numero % 10 == digito) ? 1 : 0;
        return count + contarOcorrencias(numero / 10, digito);
    }
}
