import medium.Exercicio09;
import medium.Exercicio10;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio09Medium {
    static Exercicio09 exercicio09;
    static String[] vetorNomeAlunoEsperado;

    @BeforeClass
    public static void before() {
        exercicio09 = new Exercicio09();
        String[] vetorNomeAlunoEsperado = new String[5];
        vetorNomeAlunoEsperado[0] = "Maria";
        vetorNomeAlunoEsperado[1] = "Pedro";
        vetorNomeAlunoEsperado[2] = "Simão";
        vetorNomeAlunoEsperado[3] = "Jose";
        vetorNomeAlunoEsperado[4] = "Joao";
    }
    @Test
    public void testeVetorNomeAlunoEsperado(){
        Assert.assertArrayEquals(vetorNomeAlunoEsperado, exercicio09.exibeAlunosENumeros(5));
    }
}
