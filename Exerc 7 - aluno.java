package listas.lista01;

public class Aluno {
    private int A1;
    private int A2;
    private int A3;
    private int AI;

    public Aluno(int A1, int A2, int A3) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.AI = -1; // -1 indica que a AI ainda não foi realizada
    }

    public void setNotaAI(int AI) {
        this.AI = AI;
    }

    public int pontuacaoFinal() {
        if (AI == -1) {
            return A1 + A2 + A3;
        } else {
            int minNota = Math.min(A1, A2);
            int notaFinal = A1 + A2 + A3 - minNota + AI;
            return notaFinal;
        }
    }

    public int verificarAprovacao() {
        int notaFinal = pontuacaoFinal();
        
        if (notaFinal >= 70 && AI == -1) return 1; // Aprovado sem AI
        else if (notaFinal >= 70 && AI != -1) return 2; // Aprovado com AI
        else return 3; // Reprovado
    }
}
