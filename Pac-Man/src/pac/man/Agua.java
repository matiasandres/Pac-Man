package pac.man;

public class Agua extends Estatico {

    public Agua(int x, int y) {
        setNombre("[A]");
        setObstaculo(new Celda(x, y, getNombre()));
    }
}
