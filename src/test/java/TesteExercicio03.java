import easy.Exercicio03;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio03 {// Classe

    @Test //Indica que o método é um teste
    public void testeTxibeValoresTrocados(){ // Chamada do Método

        String mensagem =  "O valor do primeiro numero é :20\n"
                +"O valor do segundo numero é :10"; //Retorna Mensagem
        Exercicio03 exercicio03 = new Exercicio03(); //Cria a Instância
        Assert.assertEquals(mensagem, exercicio03.exibeValoresTrocados(10, 20));// Compara o resultado esperado com o atual


    }
}
