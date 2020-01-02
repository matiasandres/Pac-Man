package clases;

public class Fantasma extends Personaje {

    public Fantasma(int x, int y, int nivel, int j) {
        nombre = "fantasma";
        ruta = "src/imagenes/fantasma"+j+".png";
        objCelda = new Celda(x, y, nivel, nombre, ruta);
        objCelda.setVisible(true);
    }
}
