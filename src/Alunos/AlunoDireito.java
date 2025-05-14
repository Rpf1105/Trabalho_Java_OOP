package Alunos;

public class AlunoDireito extends AlunoGraduacao {
    public AlunoDireito(String nome, String matricula, String curso, int semestre) {
        super(nome, matricula,curso,semestre);
    }
    @Override
    public void solicitarLivro(String livro){
        System.out.println("O(a) aluno(a) "+ this.nome +" de Direito solicitou o livro: "+ livro +", ele(a) tem prioridade em obras juridicas");
    }
}
