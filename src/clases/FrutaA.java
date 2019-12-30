package clases;

class FrutaA extends Celda {

    public FrutaA(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
