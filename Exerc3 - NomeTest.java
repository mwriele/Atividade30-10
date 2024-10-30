package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NomeTest {
    @Test
    public void testObterNomeCompleto() {
        Nome nome = new Nome("Sr.", "João", null, "Silva");
        assertEquals("Sr. João Silva", nome.obterNomeCompleto());
    }
}
