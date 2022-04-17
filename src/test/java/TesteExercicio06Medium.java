import medium.Exercicio05;
import medium.Exercicio06;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06Medium {
    static Exercicio06 exercicio06;

    @BeforeClass
    public static void before(){
        exercicio06 = new Exercicio06();
    }
    @Test
    public void testeFatorial(){
        Assert.assertEquals(120, exercicio06.calculaFatorial(5));
    }
}
