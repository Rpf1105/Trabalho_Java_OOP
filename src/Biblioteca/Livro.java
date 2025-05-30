package Biblioteca;

public class Livro extends ItemBiblioteca{
    public Livro(String titulo, String codigo){
        super(titulo, codigo);
    }
    @Override
    public void avaliar(){
        System.out.println("O livro: \""+titulo+"\" foi avaliado, obrigado pela colaboração!");
    }

    //Super chama o implementado em ItemBiblioteca assim pegando ja o código e titulo para todas as classes filhas
    @Override
    public String toString() {
        return super.toString()+"\nTipo de item: "+ getClass().getSimpleName();
    }
}
