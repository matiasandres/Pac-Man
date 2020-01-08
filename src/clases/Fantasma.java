package clases;

public class Fantasma extends Personaje {

    public Fantasma(int x, int y, int nivel, int j) {
        setNombre("Fantasma");
        setRuta("src/imagenes/fantasma" + j + ".png");
        setObjCelda(new Celda(x, y, nivel, getNombre(), getRuta()));
        getObjCelda().setVisible(true);
    }

    public Fantasma() {
    }

    @Override
    public void Generar(Personaje objPersonaje) {
        int x, y;
        int catidad = 0;
        int i = 0;
        int j = 1;

        if (Laberinto.nivel == 1) {
            catidad = 4;
        }
        if (Laberinto.nivel == 2) {
            catidad = 6;
        }
        if (Laberinto.nivel == 3) {
            catidad = 8;
        }

        while (i < catidad) {

            x = (int) (Math.random() * (Laberinto.laberinto.length - 2) + 1);
            y = (int) (Math.random() * (Laberinto.laberinto[0].length - 2) + 1);

            objPersonaje = new Fantasma(x, y, Laberinto.nivel, j);

            if (Laberinto.laberinto[objPersonaje.getObjCelda().x][objPersonaje.getObjCelda().y].ruta.equals("src/imagenes/celda1.png")) {

                Laberinto.laberinto[objPersonaje.getObjCelda().x][objPersonaje.getObjCelda().y].setIcon(null);
                Laberinto.laberinto[objPersonaje.getObjCelda().x][objPersonaje.getObjCelda().y] = objPersonaje.getObjCelda();
                Laberinto.panelJuego.add(Laberinto.laberinto[objPersonaje.getObjCelda().x][objPersonaje.getObjCelda().y]);
                i++;
                j++;
                if (j == 4) {
                    j = 1;
                }
            }
        }
    }
}
