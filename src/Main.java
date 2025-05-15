import Alunos.*;
import Biblioteca.Livro;
import Biblioteca.Revista;

public class Main {
    public static void main(String[] args) {
        //ETAPA 1
        //Chamadas feitas antes da classe itemBiblioteca para comparação
        AlunoGraduacao pedro = new AlunoGraduacao("Pedro","20250501","Quimica", 4);
        pedro.solicitarLivro("Como sintetizar dioxido de carbono");
        System.out.println();

        AlunoEnsinoMedio maria = new AlunoEnsinoMedio("Maria", "12345678", "Tarde", 2);
        maria.solicitarLivro("Odisseia");
        System.out.println();

        AlunoDireito igor = new AlunoDireito("Igor", "23232323", "Direito", 1);
        igor.solicitarLivro("Constituição");
        System.out.println();

        AlunoEngenharia ana = new AlunoEngenharia("Ana", "00000001", "Engenharia Civil", 5);
        ana.solicitarLivro("Normas de segurança para residencias");
        System.out.println();

        /*
        ETAPA 2
        Criação de um metodo para retornar titulo do objeto itemBiblioteca e seus filhos em String
        */
        //Avaliacao de livro
        AlunoGraduacao julia = new AlunoGraduacao("Júlia", "43512398", "Literatura", 2);
        Livro dante = new Livro("Divina comédia", "66612345");
        julia.solicitarLivro(dante.getTitulo());
        julia.avaliarItem(dante);
        System.out.println();
        //Avaliacao de revista
        AlunoEnsinoMedio vitor = new AlunoEnsinoMedio("Vitor", "451224335", "Manhã", 1);
        Revista mad = new Revista("MAD", "12457800");
        vitor.solicitarLivro(mad.getTitulo());
        vitor.avaliarItem(mad);
        System.out.println();

        /*
        ETAPA 3
        4 testes de caso para equals(), irrelevante para dados totalmente diferentes com qualquer outro dando falso
        Teste de equals por matricula, com duas subclasses diferentes
        */
        AlunoDireito jose = new AlunoDireito("Jose","20250501","Direito", 4);
        AlunoGraduacao jose2 = new AlunoGraduacao("Jose","20250501","Direito", 4);
        System.out.println("Resultado de equals de jose e jose2: "+jose2.equals(jose));

        //Teste de equals por matricula, com mesma classe e matriculas diferentes
        AlunoDireito carol = new AlunoDireito("Carol","20250501","Direito", 4);
        AlunoDireito carol2 = new AlunoDireito("Carol","20250500","Direito", 4);
        System.out.println("Resultado de equals de carol e carol2: "+carol2.equals(carol)+"\n");

        //Teste de equals por matricula, com dados identicos
        AlunoEngenharia sergio = new AlunoEngenharia("Sérgio","20250515","Engenharia Mecanica", 4);
        AlunoEngenharia sergio2 = new AlunoEngenharia("Sérgio","20250515","Engenharia Mecanica", 4);
        System.out.println("Resultado de equals de sergio e sergio2: "+sergio2.equals(sergio)+"\n");

        //Tostring()
        System.out.println(maria.toString()+"\n");//ensino medio
        System.out.println(ana.toString()+"\n"); //engenharia, por tanto pega de graduação
        System.out.println(mad.toString()+"\n"); //revista
        System.out.println(dante.toString()+"\n");//livro
    }
}