package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    public void testCalcularIMC() {
        Pessoa pessoa = new Pessoa(70, 1.75);
        assertEquals(22.86, pessoa.calcularIMC(), 0.01);
    }
}
