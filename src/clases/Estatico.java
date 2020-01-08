
package clases;

public abstract class Estatico {

    private String nombre;
    private Celda objCelda;
    private String ruta;
    
    public abstract void Generar(Estatico objEstatico);

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the objCelda
     */
    public Celda getObjCelda() {
        return objCelda;
    }

    /**
     * @param objCelda the objCelda to set
     */
    public void setObjCelda(Celda objCelda) {
        this.objCelda = objCelda;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
