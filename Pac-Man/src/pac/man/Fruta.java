package pac.man;

public abstract class Fruta {

    private Celda fruta;
    private int efecto;
    private String nombre;

    public Celda getFruta() {
        return fruta;
    }

    public void setFruta(Celda fruta) {
        this.fruta = fruta;
    }

    public int getEfecto() {
        return efecto;
    }

    public void setEfecto(int efecto) {
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
