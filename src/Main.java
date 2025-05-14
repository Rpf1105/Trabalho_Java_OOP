import Alunos.*;

public class Main {
    public static void main(String[] args) {
        AlunoGraduacao pedro = new AlunoGraduacao("Pedro","20250501","Quimica", 4);
        pedro.solicitarLivro("Como sintetizar dioxido de carbono");

        AlunoEnsinoMedio maria = new AlunoEnsinoMedio("Maria", "12345678", "Tarde", 2);
        maria.solicitarLivro("Odisseia");

        AlunoDireito igor = new AlunoDireito("Igor", "23232323", "Direito", 1);
        igor.solicitarLivro("Constituição");

        AlunoEngenharia ana = new AlunoEngenharia("Ana", "00000001", "Engenharia Civil", 5);
        ana.solicitarLivro("Normas de segurança para residencias");
    }
}