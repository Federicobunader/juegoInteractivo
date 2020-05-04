public abstract class Personaje {

    String nombre;
    int altura;
    int habilidades;
    int inteligencia;
    int peso;
    Tipo tipo;

    public String nombre(){
        return nombre;
    }

    public boolean elNombreCoincide(String nombreDeUsuario) { return nombre.equals(nombreDeUsuario);}
}
