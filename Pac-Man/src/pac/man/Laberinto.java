package pac.man;

public class Laberinto {

    private Celda[][] laberinto;
    private Celda celdas;
    private int alto, ancho;
    private int nivel;
    private Alimenticia alimenticia;
    private Agua agua;
    private PacManPJ pacman;

    public void CrearLaberinto() {
        switch (nivel) {
            case 1:
                alto = 5;
                ancho = 5;
                break;
            case 2:
                alto = 6;
                ancho = 7;
                break;
            case 3:
                alto = 7;
                ancho = 9;
                break;
        }
        laberinto = new Celda[alto][ancho];
        celdas = new Celda(0, 0);

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                celdas.setX(i);
                celdas.setY(j);
                laberinto[i][j] = celdas;
            }
        }
    }

    public void Rellenar() {
        CrearLaberinto();

        int i = 0;                                          //Agua

        switch (nivel) {
            case 1:
                while (i < 2) {
                    agua = new Agua((int) (Math.random() * alto), (int) (Math.random() * (ancho - 1)));
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY()] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    i++;
                }
                break;
            case 2:
                while (i < 2) {
                    agua = new Agua((int) (Math.random() * (alto - 1)), (int) (Math.random() * (ancho - 1)));
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY()] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 1][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 1][agua.getObstaculo().getY()] = agua.getObstaculo();
                    i++;
                }
                break;
            case 3:
                while (i < 2) {
                    agua = new Agua((int) (Math.random() * (alto - 2)), (int) (Math.random() * (ancho - 1)));
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY()] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX()][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 1][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 1][agua.getObstaculo().getY()] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 2][agua.getObstaculo().getY() + 1] = agua.getObstaculo();
                    laberinto[agua.getObstaculo().getX() + 2][agua.getObstaculo().getY()] = agua.getObstaculo();
                    i++;
                }
                break;
        }
        i = 0;                               // Fruta A
        switch (nivel) {
            case 1:
                while (i < 3) {
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if (laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()].getContenido().equals("[ ]")) {
                        laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()] = alimenticia.getFruta();
                        i++;
                    }
                }
                break;
            case 2:
                while (i < 5) {
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if (laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()].getContenido().equals("[ ]")) {
                        laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()] = alimenticia.getFruta();
                        i++;
                    }
                }
                break;
            case 3:
                while (i < 7) {
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if (laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()].getContenido().equals("[ ]")) {
                        laberinto[alimenticia.getFruta().getX()][alimenticia.getFruta().getY()] = alimenticia.getFruta();
                        i++;
                    }
                }
                break;
        }
        i = 0;
        while (i < 1) {
            pacman = new PacManPJ((int) (Math.random() * alto), (int) (Math.random() * ancho));
            if (laberinto[pacman.getPersonaje().getX()][pacman.getPersonaje().getY()].getContenido().equals("[ ]")) {
                laberinto[pacman.getPersonaje().getX()][pacman.getPersonaje().getY()] = pacman.getPersonaje();
                i++;
            }
        }
    }

    public void Mostrar() {
        Rellenar();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(laberinto[i][j].getContenido());
            }
            System.out.println("");
        }
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
