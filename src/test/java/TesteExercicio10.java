import easy.Exercicio10;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio10 {
    @Test
    public void testecalcularInvestimento(){

        Exercicio10 exercicio10 = new Exercicio10();
        double valorJuros = exercicio10.calcularInvestimento(10000, 0.05);
        DecimalFormat formato = new DecimalFormat("#,###.00");
        Assert.assertEquals("5.000,00", formato.format(valorJuros));
    }
}
