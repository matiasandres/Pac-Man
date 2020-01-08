package clases;

public class Pared extends Estatico {

    public Pared(int x, int y, int nivel) {
        setNombre("Pared");
        setRuta("src/imagenes/pared.png");
        setObjCelda(new Celda(x, y, nivel, getNombre(), getRuta()));
        getObjCelda().setVisible(true);
    }

    Pared() {
    }

    @Override
    public void Generar(Estatico objEstatico) {

        int x, y;
        int cantidad = 0;
        int i = 0;

        if (Laberinto.nivel == 1) {
            cantidad = 40;
        }
        if (Laberinto.nivel == 2) {
            cantidad = 60;
        }
        if (Laberinto.nivel == 3) {
            cantidad = 77;
        }

        while (i < 40) {

            x = (int) (Math.random() * (Laberinto.laberinto.length - 2) + 1);
            y = (int) (Math.random() * (Laberinto.laberinto[0].length - 2) + 1);

            objEstatico = new Pared(x, y, Laberinto.nivel);
            if (Laberinto.laberinto[objEstatico.getObjCelda().x][objEstatico.getObjCelda().y].ruta.equals("src/imagenes/celda1.png")) {
                Laberinto.laberinto[objEstatico.getObjCelda().x][objEstatico.getObjCelda().y].setIcon(null);
                Laberinto.laberinto[objEstatico.getObjCelda().x][objEstatico.getObjCelda().y] = null;
                Laberinto.laberinto[objEstatico.getObjCelda().x][objEstatico.getObjCelda().y] = objEstatico.getObjCelda();
                Laberinto.panelJuego.add(Laberinto.laberinto[objEstatico.getObjCelda().x][objEstatico.getObjCelda().y]);
                i++;
            }
        }
    }
}
