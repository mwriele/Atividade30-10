package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContribuinteTest {
    @Test
    public void testPodeAposentarFeminino() {
        Contribuinte contribuinte = new Contribuinte(63, 'F', 16);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void testNaoPodeAposentarMasculino() {
        Contribuinte contribuinte = new Contribuinte(64, 'M', 19);
        assertFalse(contribuinte.podeAposentar());
    }
}
