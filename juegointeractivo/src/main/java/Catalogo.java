public class Catalogo {

    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    private void agregarPersonaje(Personaje unPersonaje){
        personajes.add(unPersonaje); //unPersonaje puede ser un Villano, un Heroe, etc
    }

    private Usuario seleccionarPersonaje(String nombrePersonaje) {
        if (!personajes.isEmpty()) {
            for (int i = 0; i < personajes.size(); i++) {
                if (personajes.get(i).elNombreCoincide(nombrePersonaje)) {
                    return personajes.get(i);
                }
            }
        }
        return null;
    }
    }
}
