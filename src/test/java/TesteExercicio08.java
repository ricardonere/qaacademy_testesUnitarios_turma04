import easy.Exercicio08;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio08 {
    @Test
    public void calcularImpostoDeRenda(){
        Exercicio08 exercicio08 = new Exercicio08();
        double ir = exercicio08.calcularImpostoDeRenda(2000.00);
        DecimalFormat formato = new DecimalFormat("#,###.00");
        Assert.assertEquals("7,20",formato.format(ir));



    }
}
