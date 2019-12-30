package clases;

public class Pared extends Celda {

    public Pared(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
