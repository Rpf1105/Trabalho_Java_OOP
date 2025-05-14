package Alunos;
public class AlunoGraduacao extends Aluno {
    String curso;
    int semestre;
    public AlunoGraduacao(String nome, String matricula, String curso, int semestre) {
        super(nome, matricula);
        this.curso = curso;
        this.semestre = semestre;
    }
    @Override
    public void solicitarLivro(String livro){
        System.out.println("O(a) aluno(a) "+ this.nome +" de "+ this.curso +" solicitou o livro: "+ livro);
    }
}
