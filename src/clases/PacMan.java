package clases;

public class PacMan extends Personaje {

    private static int vida = 3;

    public PacMan(int x, int y, int nivel, char direccion) {
        setNombre("PacMan");
        setRuta("src/imagenes/pacman2" + direccion + ".png");
        setObjCelda(new Celda(x, y, nivel, getNombre(), getRuta()));
        getObjCelda().setVisible(true);
    }

    @Override
    public void Generar(Personaje objPersonaje) {
    }
    
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
