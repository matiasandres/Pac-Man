package pac.man;

public class Alimenticia extends Fruta {

    public Alimenticia(int x, int y) {
        setNombre("[F]");
        setFruta(new Celda(x, y, getNombre()));
        setEfecto(2);
    }
}
