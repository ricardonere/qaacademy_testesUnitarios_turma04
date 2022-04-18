import medium.Exercicio07_08;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio07_08{
    static Exercicio07_08 exercicio07_08;
    static String[] vetorMesesEsperado= new String[12];

    @BeforeClass
    public static void before(){
      exercicio07_08 = new Exercicio07_08();

        vetorMesesEsperado[0] = "Janeiro";
        vetorMesesEsperado[1] = "Fevereiro";
        vetorMesesEsperado[2] = "Março";
        vetorMesesEsperado[3] = "Abril";
        vetorMesesEsperado[4] = "Maio";
        vetorMesesEsperado[5] = "Junho";
        vetorMesesEsperado[6] = "Julho";
        vetorMesesEsperado[7] = "Agosto";
        vetorMesesEsperado[8] = "Setembro";
        vetorMesesEsperado[9] = "Outubro";
        vetorMesesEsperado[10] = "Novembro";
        vetorMesesEsperado[11] = "Dezembro";

    }
@Test
    public void testeVetorMeses(){
    String[] vetorMeses= exercicio07_08.preencheVetorMeses();
    Assert.assertArrayEquals(vetorMesesEsperado,vetorMeses);


}


}
