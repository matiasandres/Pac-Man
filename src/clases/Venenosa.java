package clases;

class Venenosa extends Fruta {
    
    public Venenosa(int x, int y, int nivel) {
        ruta = "src/imagenes/frutaV.png";
        objCelda = new Celda(x, y, nivel, ruta);
        objCelda.setVisible(true);
    }
}
