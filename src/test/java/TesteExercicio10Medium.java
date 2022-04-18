import medium.Exercicio10;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio10Medium {
    static Exercicio10 exercicio10;
    static long[] vetorFibonacciEsperado;

    @BeforeClass
    public static void before() {
        exercicio10 = new Exercicio10();
        vetorFibonacciEsperado = new long[10];
        vetorFibonacciEsperado[0] = 0;
        vetorFibonacciEsperado[1] = 1;
        vetorFibonacciEsperado[2] = 1;
        vetorFibonacciEsperado[3] = 2;
        vetorFibonacciEsperado[4] = 3;
        vetorFibonacciEsperado[5] = 5;
        vetorFibonacciEsperado[6] = 8;
        vetorFibonacciEsperado[7] = 13;
        vetorFibonacciEsperado[8] = 21;
        vetorFibonacciEsperado[9] = 34;


    }


}