import easy.Exercicio07;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio07 {
    @Test
    public void calcularInss(){
        Exercicio07 exercicio07 = new Exercicio07();
        double inss = exercicio07.calcularInss(1045.00);
        Assert.assertEquals("78.375", String.valueOf(inss));
    }
}
