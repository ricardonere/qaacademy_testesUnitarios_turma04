import medium.Exercicio03;
import medium.Exercicio04;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExrcicio04Medium {
    static Exercicio04 exercicio04;

    @BeforeClass
    public static void before(){
        exercicio04 = new Exercicio04();
    }
    @Test
    public void testeMultiplica(){
        exercicio04.multiplicaAteMil();
    }
}
