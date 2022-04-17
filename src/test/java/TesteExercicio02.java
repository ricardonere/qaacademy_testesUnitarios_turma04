import easy.Exercicio02;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio02 {//Classe
    @Test// Indica que o método é um teste
    public void testePalavraDigitada() { // Chamada do Método
        Exercicio02 exercicio02 = new Exercicio02(); // Cria a Instância
        Assert.assertEquals("Voce digitou: Teste", exercicio02.retornaPalavraDigitada("Teste"));// Compara o resutado esperado com o atual
    }
}
