package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public double calcularInvestimentoJurosCompostos(double valorInvestimento) {

        double taxaJuros = 0.05, valorJuros, valorTotal;
        int i = 1;
        valorTotal = valorInvestimento;
        while (i <= 10) {
            valorTotal = (valorTotal * taxaJuros) + valorTotal;
            i++;
        }
        valorJuros = valorTotal - valorInvestimento;
       
        return valorJuros;
    }

}
