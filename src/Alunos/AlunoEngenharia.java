package Alunos;

public class AlunoEngenharia extends AlunoGraduacao{
    public AlunoEngenharia(String nome, String matricula, String curso, int semestre) {
        super(nome, matricula,curso,semestre);
    }
    @Override
    public void solicitarLivro(String livro){
        System.out.println("O(a) aluno(a) "+ this.nome +" de Engenharia solicitou o livro: "+ livro +", ele(a) tem prioridade em materiais técnicos");

    }
}
