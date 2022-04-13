import easy.Exercicio11;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio11 {
@Test
    public void somarDois(){
        Exercicio11 exercicio11 = new Exercicio11();
    int vetorSoma = exercicio11.somarDois(100);

    Assert.assertEquals(300,vetorSoma);

    }
    @Test
    public void somarDoisComVetor(){
        Exercicio11 exercicio11 = new Exercicio11();
        int []vetorSoma = exercicio11.somarDoisComVetor(100);

        Assert.assertEquals(102,vetorSoma[0]);

    }
}
