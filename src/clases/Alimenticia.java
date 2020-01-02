package clases;

class Alimenticia extends Fruta {

    public Alimenticia(int x, int y, int nivel) {
        ruta = "src/imagenes/frutaA.png";
        objCelda = new Celda(x, y, nivel, ruta);
        objCelda.setVisible(true);
    }
}
