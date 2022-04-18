import easy.Exercicio06;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio06 {
    @Test
    public void calcularMedia(){
        Exercicio06 exercicio06 = new Exercicio06();
        Assert.assertEquals("Aprovado", exercicio06.verificarAprovacao (4,8));
    }



}
