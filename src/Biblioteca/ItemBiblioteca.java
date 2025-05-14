package Biblioteca;

public class ItemBiblioteca {
    String titulo;
    String codigo;
    public ItemBiblioteca(String titulo, String codigo){
        this.titulo=titulo;
        this.codigo=codigo;
    }
    //Mensagem genérica pois sera sobreescrito
    public void avaliar(){
        System.out.println("Item avaliado");
    }
    //Usado para o metodo solicitarLivro da classe Aluno, o qual precisa de uma String, assim passando esse metodo como parametro
    //Não é sobreescrito nas classes filhas por ter apenas essa utilidade
    public String getTitulo(){
        return titulo;
    }
}
