import medium.Exercicio02;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio02Medium {//Classe
    static DecimalFormat formato;
    static Exercicio02 exercicio02;

    @BeforeClass
    public static void before() {//Chamada do Método
        exercicio02 = new Exercicio02();//Instância da classe
        formato = new DecimalFormat("#,###.00");
    }

    @Test
    public void testecalcularInvestimentoJurosCompostos() {
        String valorEsperado = "628,89";
        String valorAtual = formato.format(exercicio02.calcularInvestimentoJurosCompostos(1000.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }



}
