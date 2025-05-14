package Alunos;

import Biblioteca.ItemBiblioteca;

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
    //avaliarItem aceita qualquer classe que é derivada de itemBiblioteca, e chama o metodo da instancia passada
    public void avaliarItem(ItemBiblioteca item){
        item.avaliar();
    }
}
