package clases;

class FrutaV extends Celda{
    
    public FrutaV(int x, int y, int nivel, String ruta) {
        super(x, y, nivel, ruta);
        super.ruta = ruta;
        setVisible(true);
    }
}
