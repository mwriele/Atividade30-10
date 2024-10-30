package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(50, retangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(30, retangulo.calcularPerimetro());
    }
}
