package Biblioteca;

public class Revista extends ItemBiblioteca{
    public Revista(String titulo, String codigo){
        super(titulo, codigo);
    }
    @Override
    public void avaliar(){
        System.out.println("A revista: \""+titulo+"\" foi avaliada, agradecemos a colaboração!");
    }
}
