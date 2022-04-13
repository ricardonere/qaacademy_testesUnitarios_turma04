import medium.Exercicio01;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio01Medium {
    @Test
    public void testeVerificarParImpar(){
        Exercicio01 exercicio01 = new Exercicio01();
        String mensagemPar = "O Número: 0 é par";
        String mensagemImpar = "O Número: 1 é ímpar";
        String []vetorParImpar = exercicio01.verificarNumerosParImpar();

        Assert.assertEquals( mensagemPar, vetorParImpar[0] );
        Assert.assertEquals( mensagemImpar, vetorParImpar[1] );
    }
}
