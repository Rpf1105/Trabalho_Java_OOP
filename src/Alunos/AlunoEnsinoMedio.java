package Alunos;

public class AlunoEnsinoMedio extends Aluno{
    String turno;
    int serie;
    public AlunoEnsinoMedio(String nome, String matricula, String turno, int serie){
        super(nome, matricula);
        this.turno=turno;
        this.serie=serie;
    }
    public void solicitarLivro(String livro){
        System.out.println("O(a) aluno(a) "+ this.nome +" do "+this.serie+"° do Ensino Médio solicitou o livro: "+ livro);
    }
    @Override
    public String toString() {
        return super.toString()+"\nTurno: "+turno+ "\nSérie: " + serie + "° Ano";
    }
}
