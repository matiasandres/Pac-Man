package pac.man;

public class PacManPJ extends Personaje {

    public PacManPJ(int x, int y) {
        setNombre("[<]");
        setPersonaje(new Celda(x, y, getNombre()));
        setVida(7);
    }

}
