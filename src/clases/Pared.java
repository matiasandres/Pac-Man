package clases;

public class Pared extends Estatico {

    public Pared(int x, int y, int nivel) {
        nombre = "Pared";
        ruta = "src/imagenes/pared.png";
        objCelda = new Celda(x, y, nivel, nombre, ruta);
        objCelda.setVisible(true);
    }
}
