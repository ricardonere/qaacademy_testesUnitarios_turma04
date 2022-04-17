import medium.Exercicio04;
import medium.Exercicio05;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio05Medium {
    static Exercicio05 exercicio05;

    @BeforeClass
    public static void before(){
        exercicio05 = new Exercicio05();
    }
    @Test
    public void testeMultiplica(){
      Assert.assertEquals(1, exercicio05.verificaMenorValor());
    }
}
