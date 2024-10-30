package listas.lista01;

public class Nome {
    private String titulo;
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;

    public Nome(String titulo, String nome, String nomeDoMeio, String ultimoNome) {
        this.titulo = titulo;
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
    }

    public String obterNomeCompleto() {
        StringBuilder completo = new StringBuilder();
        if (titulo != null) completo.append(titulo).append(" ");
        completo.append(nome).append(" ");
        if (nomeDoMeio != null) completo.append(nomeDoMeio).append(" ");
        completo.append(ultimoNome);
        return completo.toString().trim();
    }
}
