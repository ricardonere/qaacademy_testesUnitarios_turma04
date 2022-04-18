import medium.Exercicio01;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio01Medium {
    @Test
    public void testeVerificarParImpar(){
        Exercicio01 exercicio01 = new Exercicio01();

        Assert.assertEquals( "O Número: 0 é par", exercicio01.verificarNumerosParImpar()[0] );
        Assert.assertEquals( "O Número: 1 é ímpar", exercicio01.verificarNumerosParImpar()[1] );
    }
}
