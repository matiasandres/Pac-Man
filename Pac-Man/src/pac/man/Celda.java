package pac.man;

public class Celda {

    private int x, y;
    private String contenido = "[ ]";

    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Celda(int x, int y, String contenido) {
        this.contenido = contenido;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
