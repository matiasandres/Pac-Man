package clases;

public class PacMan extends Celda {
    
    int vida = 5;

    public PacMan(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
