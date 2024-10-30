package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Test
    public void testObterTipoEquilatero() {
        Triangulo triangulo = new Triangulo(3, 3, 3);
        assertEquals("Equilátero", triangulo.obterTipo());
    }

    @Test
    public void testCalcularArea() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        triangulo.setAltura(4, 3);
        assertEquals(6, triangulo.calcularArea());
    }
}
