package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    @Test
    public void testAprovadoSemAI() {
        Aluno aluno = new Aluno(20, 25, 30);
        assertEquals(1, aluno.verificarAprovacao());
    }

    @Test
    public void testReprovadoComAI() {
        Aluno aluno = new Aluno(10, 15, 20);
        aluno.setNotaAI(25);
        assertEquals(3, aluno.verificarAprovacao());
    }

    @Test
    public void testAprovadoComAI() {
        Aluno aluno = new Aluno(20, 15, 30);
        aluno.setNotaAI(30);
        assertEquals(2, aluno.verificarAprovacao());
    }
}
