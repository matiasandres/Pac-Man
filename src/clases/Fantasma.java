
package clases;

public class Fantasma extends Celda{

    public Fantasma(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
