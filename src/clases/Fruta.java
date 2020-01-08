package clases;

public abstract class Fruta {

    private String nombre;
    private Celda objCelda;
    private String ruta;

    public abstract void Generar(Fruta objFruta);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celda getObjCelda() {
        return objCelda;
    }

    public void setObjCelda(Celda objCelda) {
        this.objCelda = objCelda;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
