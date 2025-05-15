package Biblioteca;

public class Revista extends ItemBiblioteca{
    public Revista(String titulo, String codigo){
        super(titulo, codigo);
    }
    @Override
    public void avaliar(){
        System.out.println("A revista: \""+titulo+"\" foi avaliada, agradecemos a colaboração!");
    }
    //Super chama o implementado em ItemBiblioteca assim pegando ja o código e titulo para todas as classes filhas
    public String toString() {
        return super.toString()+"\nTipo de item: "+ getClass().getSimpleName();
    }
}
