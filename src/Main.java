import Alunos.*;
import Biblioteca.Livro;
import Biblioteca.Revista;

public class Main {
    public static void main(String[] args) {
        //Chamadas feitas antes da classe itemBiblioteca para comparação
        AlunoGraduacao pedro = new AlunoGraduacao("Pedro","20250501","Quimica", 4);
        pedro.solicitarLivro("Como sintetizar dioxido de carbono");

        AlunoEnsinoMedio maria = new AlunoEnsinoMedio("Maria", "12345678", "Tarde", 2);
        maria.solicitarLivro("Odisseia");

        AlunoDireito igor = new AlunoDireito("Igor", "23232323", "Direito", 1);
        igor.solicitarLivro("Constituição");

        AlunoEngenharia ana = new AlunoEngenharia("Ana", "00000001", "Engenharia Civil", 5);
        ana.solicitarLivro("Normas de segurança para residencias");

        //Criação de um metodo para retornar titulo do objeto itemBiblioteca e seus filhos em String
        AlunoGraduacao julia = new AlunoGraduacao("Júlia", "43512398", "Literatura", 2);
        Livro dante = new Livro("Divina comédia", "66612345");
        julia.solicitarLivro(dante.getTitulo());
        julia.avaliarItem(dante);

        AlunoEnsinoMedio vitor = new AlunoEnsinoMedio("Vitor", "451224335", "Manhã", 1);
        Revista mad = new Revista("MAD", "12457800");
        vitor.solicitarLivro(mad.getTitulo());
        vitor.avaliarItem(mad);

    }
}