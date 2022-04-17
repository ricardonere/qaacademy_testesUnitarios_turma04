import medium.Exercicio03;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio03Medium {
    static Exercicio03 exercicio03;

    @BeforeClass
    public static void before(){
        exercicio03 = new Exercicio03();
    }
    @Test
    public void testeSoma(){
        exercicio03.somaAteMil();
    }
}
