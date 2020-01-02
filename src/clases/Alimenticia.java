package clases;

class Alimenticia extends Fruta {

    public Alimenticia(int x, int y, int nivel) {
        nombre = "Alimenticia";
        ruta = "src/imagenes/frutaA.png";
        objCelda = new Celda(x, y, nivel, nombre, ruta);
        objCelda.setVisible(true);
    }
}
