package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {
    @Test
    public void testMinimo() {
        Numeros numeros = new Numeros(1, 5, 3);
        assertEquals(1, numeros.minimo());
    }

    @Test
    public void testMaximo() {
        Numeros numeros = new Numeros(1, 5, 3);
        assertEquals(5, numeros.maximo());
    }
}
