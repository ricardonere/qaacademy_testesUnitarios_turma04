import easy.Exercicio04;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio04 {// Classe

    @Test// Indica que o método é um teste
    public void testecalcularDobro(){// Chamada do método

        Exercicio04 exercicio04 = new Exercicio04(); // Cria a Instância da classe
        Assert.assertEquals(20, exercicio04.calcularDobro(10)); // Compara o resultado esperado com o atual

    }
}
