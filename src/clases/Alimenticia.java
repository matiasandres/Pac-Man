package clases;

class Alimenticia extends Fruta {

    public Alimenticia(int x, int y, int nivel) {
        setNombre("Alimenticia");
        setRuta("src/imagenes/frutaA.png");
        setObjCelda(new Celda(x, y, nivel, getNombre(), getRuta()));
        getObjCelda().setVisible(true);
    }

    public Alimenticia() {
    }

    @Override
    public void Generar(Fruta objFruta) {
        int x, y;
        int cantidad = 0;
        int i = 0;

        if (Laberinto.nivel == 1) {
            cantidad = 5;
        }
        if (Laberinto.nivel == 2) {
            cantidad = 10;
        }
        if (Laberinto.nivel == 3) {
            cantidad = 15;
        }

        while (i < 5) {

            x = (int) (Math.random() * (Laberinto.laberinto.length - 2) + 1);
            y = (int) (Math.random() * (Laberinto.laberinto[0].length - 2) + 1);

            objFruta = new Alimenticia(x, y, Laberinto.nivel);
            if (Laberinto.laberinto[objFruta.getObjCelda().x][objFruta.getObjCelda().y].ruta.equals("src/imagenes/celda1.png")) {
                Laberinto.laberinto[objFruta.getObjCelda().x][objFruta.getObjCelda().y].setIcon(null);
                Laberinto.laberinto[objFruta.getObjCelda().x][objFruta.getObjCelda().y] = objFruta.getObjCelda();
                Laberinto.panelJuego.add(Laberinto.laberinto[objFruta.getObjCelda().x][objFruta.getObjCelda().y]);
                i++;
            }
        }
    }
}
