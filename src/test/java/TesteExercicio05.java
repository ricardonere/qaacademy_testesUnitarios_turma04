import easy.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio05 {
    @Test
    public void testeCalcularSoma() {
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(15, exercicio05.calcularSoma(4, 8, 3));

    }

    @Test
    public void testeCalcularSubtracao() {
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(-7, exercicio05.calcularSubtracao(4, 8, 3));
    }

    @Test
    public void testeCalcularMultiplicacao() {
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(96, exercicio05.calcularMultiplicacao(4, 8, 3));
    }
    @Test
    public void testeCalcularMedia() {
        Exercicio05 exercicio05 = new Exercicio05();
        double media = exercicio05.calcularMedia(4, 8, 3);
        Assert.assertEquals("5.0", String.valueOf(media));
    }



}
