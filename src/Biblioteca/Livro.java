package Biblioteca;

public class Livro extends ItemBiblioteca{
    public Livro(String titulo, String codigo){
        super(titulo, codigo);
    }
    @Override
    public void avaliar(){
        System.out.println("O livro: \""+titulo+"\" foi avaliado, obrigado pela colaboração!");
    }
}
