package pac.man;

public abstract class Personaje {

    private Celda personaje;
    private int vida;
    private String nombre;

    public Celda getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Celda personaje) {
        this.personaje = personaje;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
