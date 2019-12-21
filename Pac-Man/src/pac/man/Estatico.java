package pac.man;

public abstract class Estatico {

    private Celda obstaculo;
    private String nombre;

    public Celda getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(Celda obstaculo) {
        this.obstaculo = obstaculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
