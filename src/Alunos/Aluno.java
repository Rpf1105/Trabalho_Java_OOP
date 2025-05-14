package Alunos;

public class Aluno {
    String nome;
    String matricula;
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public void solicitarLivro(String livro){
        System.out.println("O livro \""+ livro + "\" foi solicitado por: " + nome);
    }
}
