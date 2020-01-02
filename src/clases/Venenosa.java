package clases;

class Venenosa extends Fruta {
    
    public Venenosa(int x, int y, int nivel) {
        nombre = "Venenosa";
        ruta = "src/imagenes/frutaV.png";
        objCelda = new Celda(x, y, nivel, nombre, ruta);
        objCelda.setVisible(true);
    }
}
