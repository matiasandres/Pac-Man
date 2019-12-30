package clases;

public class PacMan extends Celda {

    public PacMan(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
