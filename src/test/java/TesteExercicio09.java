import easy.Exercicio09;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio09 {
@Test
    public void testeCalcularTabuada(){
        Exercicio09 exercicio09 = new Exercicio09();
    int calcularTabuada[] = { 10,20,30,40,50,60,70,80,90,100};
       exercicio09.calcularTabuada(10);
       Assert.assertArrayEquals (calcularTabuada,exercicio09.calcularTabuada(10));

    }
}
