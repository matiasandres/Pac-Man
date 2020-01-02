package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class Laberinto {

    Celda[][] laberinto; //Variable para la matriz de "Celda"
    PanelJuego panelJuego;//Variable para el panel
    int nivel = 3;
    Celda celda;
    Pared objPared;
    FrutaA objFrutaA;
    FrutaV objFrutaV;
    Fantasma objFantasma;
    PacMan objPacMan;

    public Laberinto() {

        panelJuego = new PanelJuego();//Crea un objeto "PanelJuego" que hereda de "JPanel"
        CrearNivel();
        Llenar();
        GenerarParedes();
        GenerarFrutaA();
        GenerarFrutaV();
        GenerarFantasma();
        GenerarPacMan();
        MoverPacMan();
        panelJuego.getVentana().setVisible(true);//Hace visible la ventana
    }

    private void CrearNivel() {

        if (nivel == 1) {
            laberinto = new Celda[15][15];
        }
        if (nivel == 2) {
            laberinto = new Celda[22][15];
        }
        if (nivel == 3) {
            laberinto = new Celda[28][15];
        }
    }

    private void Llenar() {
        //Rellena la matriz de "Celda" y las agrega al panelJuego
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                celda = new Celda(i, j, nivel);
                laberinto[i][j] = celda;
                if (i == 0 || j == 0 || i == laberinto.length - 1 || j == laberinto[i].length - 1) {//Añade paredes alrededor del laberinto
                    objPared = new Pared(i, j, nivel, "src/imagenes/pared.png");
                    laberinto[i][j] = objPared;
                }
                panelJuego.add(laberinto[i][j]);
            }
        }
    }

    public final void GenerarParedes() {

        int i = 0;
        if (nivel == 1) {
            while (i < 40) {
                objPared = new Pared((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/pared.png");
                if (laberinto[objPared.x][objPared.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objPared.x][objPared.y].setIcon(null);
                    laberinto[objPared.x][objPared.y] = null;
                    laberinto[objPared.x][objPared.y] = objPared;
                    panelJuego.add(laberinto[objPared.x][objPared.y]);
                    i++;
                }
            }
        }
        if (nivel == 2) {
            while (i < 80) {
                objPared = new Pared((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/pared.png");
                if (laberinto[objPared.x][objPared.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objPared.x][objPared.y].setIcon(null);
                    laberinto[objPared.x][objPared.y] = objPared;
                    panelJuego.add(laberinto[objPared.x][objPared.y]);
                    i++;
                }
            }
        }
        if (nivel == 3) {
            while (i < 120) {
                objPared = new Pared((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/pared.png");
                if (laberinto[objPared.x][objPared.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objPared.x][objPared.y].setIcon(null);
                    laberinto[objPared.x][objPared.y] = objPared;
                    panelJuego.add(laberinto[objPared.x][objPared.y]);
                    i++;
                }
            }
        }
    }

    public final void GenerarFrutaA() {

        int i = 0;
        if (nivel == 1) {
            while (i < 5) {
                objFrutaA = new FrutaA((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaA.png");
                if (laberinto[objFrutaA.x][objFrutaA.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objFrutaA.x][objFrutaA.y].setIcon(null);
                    laberinto[objFrutaA.x][objFrutaA.y] = objFrutaA;
                    panelJuego.add(laberinto[objFrutaA.x][objFrutaA.y]);
                    i++;
                }
            }
        }
        if (nivel == 2) {
            while (i < 10) {
                objFrutaA = new FrutaA((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaA.png");
                if (laberinto[objFrutaA.x][objFrutaA.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objFrutaA.x][objFrutaA.y].setIcon(null);
                    laberinto[objFrutaA.x][objFrutaA.y] = objFrutaA;
                    panelJuego.add(laberinto[objFrutaA.x][objFrutaA.y]);
                    i++;
                }
            }
        }
        if (nivel == 3) {
            while (i < 15) {
                objFrutaA = new FrutaA((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaA.png");
                if (laberinto[objFrutaA.x][objFrutaA.y].ruta.equals("src/imagenes/celda1.png")) {
                    laberinto[objFrutaA.x][objFrutaA.y].setIcon(null);
                    laberinto[objFrutaA.x][objFrutaA.y] = objFrutaA;
                    panelJuego.add(laberinto[objFrutaA.x][objFrutaA.y]);
                    i++;
                }
            }
        }
    }

    public final void GenerarFrutaV() {

        int i = 0;
        if (nivel == 1) {

            while (i < 5) {

                objFrutaV = new FrutaV((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaV.png");
                if (laberinto[objFrutaV.x][objFrutaV.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFrutaV.x][objFrutaV.y].setIcon(null);
                    laberinto[objFrutaV.x][objFrutaV.y] = objFrutaV;
                    panelJuego.add(laberinto[objFrutaV.x][objFrutaV.y]);
                    i++;
                }
            }
        }
        if (nivel == 2) {

            while (i < 10) {

                objFrutaV = new FrutaV((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaV.png");
                if (laberinto[objFrutaV.x][objFrutaV.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFrutaV.x][objFrutaV.y].setIcon(null);
                    laberinto[objFrutaV.x][objFrutaV.y] = objFrutaV;
                    panelJuego.add(laberinto[objFrutaV.x][objFrutaV.y]);
                    i++;
                }
            }
        }
        if (nivel == 3) {

            while (i < 15) {

                objFrutaV = new FrutaV((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/frutaV.png");
                if (laberinto[objFrutaV.x][objFrutaV.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFrutaV.x][objFrutaV.y].setIcon(null);
                    laberinto[objFrutaV.x][objFrutaV.y] = objFrutaV;
                    panelJuego.add(laberinto[objFrutaV.x][objFrutaV.y]);
                    i++;
                }
            }
        }
    }

    public final void GenerarFantasma() {

        int i = 0;
        int j = 1;

        if (nivel == 1) {

            while (i < 4) {

                objFantasma = new Fantasma((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto.length - 2) + 1), nivel, "src/imagenes/fantasma" + j + ".png");

                if (laberinto[objFantasma.x][objFantasma.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFantasma.x][objFantasma.y].setIcon(null);
                    laberinto[objFantasma.x][objFantasma.y] = objFantasma;
                    panelJuego.add(laberinto[objFantasma.x][objFantasma.y]);
                    i++;
                    j++;
                }
            }
        }

        if (nivel == 2) {

            while (i < 1) {

                objFantasma = new Fantasma((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto.length - 2) + 1), nivel, "src/imagenes/fantasma" + j + ".png");

                if (laberinto[objFantasma.x][objFantasma.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFantasma.x][objFantasma.y].setIcon(null);
                    laberinto[objFantasma.x][objFantasma.y] = objFantasma;
                    panelJuego.add(laberinto[objFantasma.x][objFantasma.y]);
                    i++;
                    j++;
//                    if (j == 4) {
//                        j = 1;
//                    }
                }
            }
        }

        if (nivel == 3) {

            while (i < 1) {

                objFantasma = new Fantasma((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto.length - 2) + 1), nivel, "src/imagenes/fantasma" + j + ".png");

                if (laberinto[objFantasma.x][objFantasma.y].ruta.equals("src/imagenes/celda1.png")) {

                    laberinto[objFantasma.x][objFantasma.y].setIcon(null);
                    laberinto[objFantasma.x][objFantasma.y] = objFantasma;
                    panelJuego.add(laberinto[objFantasma.x][objFantasma.y]);
                    i++;
                    j++;
//                    if (j == 4) {
//                        j = 1;
//                    }
                }
            }
        }

    }

    public final void GenerarPacMan() {

        int i = 0;
        while (i < 1) {
            objPacMan = new PacMan((int) (Math.random() * (laberinto.length - 2) + 1), (int) (Math.random() * (laberinto[0].length - 2) + 1), nivel, "src/imagenes/pacman2R.png");
            if (laberinto[objPacMan.x][objPacMan.y].ruta.equals("src/imagenes/celda1.png")) {
                laberinto[objPacMan.x][objPacMan.y].setIcon(null);
                laberinto[objPacMan.x][objPacMan.y] = null;
                laberinto[objPacMan.x][objPacMan.y] = objPacMan;
                panelJuego.add(laberinto[objPacMan.x][objPacMan.y]);
                i++;
            }
        }
    }

    public final void MoverPacMan() {

        panelJuego.getVentana().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ImageIcon iconoVacio = new ImageIcon("src/");
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (laberinto[objPacMan.x][objPacMan.y - 1].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {
                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        objPacMan.y--;

                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una FrutaA
                            objPacMan.vida++;
                            System.out.println("+");
                        }
                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una FrutaV
                            objPacMan.vida--;
                            System.out.println("-");
                        }

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {
                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        laberinto[objPacMan.x][objPacMan.y] = new PacMan(objPacMan.x, objPacMan.y, nivel, "src/imagenes/pacman2U.png");
                        panelJuego.add(laberinto[objPacMan.x][objPacMan.y]);

                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (laberinto[objPacMan.x][objPacMan.y + 1].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {
                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        objPacMan.y++;

                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una FrutaA

                            objPacMan.vida++;
                            System.out.println("+");
                        }
                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una FrutaV

                            objPacMan.vida--;
                            System.out.println("-");
                        }

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {

                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        laberinto[objPacMan.x][objPacMan.y] = new PacMan(objPacMan.x, objPacMan.y, nivel, "src/imagenes/pacman2D.png");
                        panelJuego.add(laberinto[objPacMan.x][objPacMan.y]);

                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                    if (laberinto[objPacMan.x - 1][objPacMan.y].ruta != "src/imagenes/pared.png") {

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {

                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }

                        objPacMan.x--;

                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una FrutaA
                            objPacMan.vida++;
                            System.out.println("+");
                        }
                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una FrutaV
                            objPacMan.vida--;
                            System.out.println("-");
                        }

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {
                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        laberinto[objPacMan.x][objPacMan.y] = new PacMan(objPacMan.x, objPacMan.y, nivel, "src/imagenes/pacman2L.png");
                        panelJuego.add(laberinto[objPacMan.x][objPacMan.y]);

                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                    if (laberinto[objPacMan.x + 1][objPacMan.y].ruta != "src/imagenes/pared.png") {

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {

                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        objPacMan.x++;

                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una FrutaA

                            objPacMan.vida++;
                            System.out.println("+");
                        }
                        if (laberinto[objPacMan.x][objPacMan.y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una FrutaV

                            objPacMan.vida--;
                            System.out.println("-");
                        }

                        if (laberinto[objPacMan.x][objPacMan.y] != null && laberinto[objPacMan.x][objPacMan.y].getIcon() != null) {

                            laberinto[objPacMan.x][objPacMan.y].setIcon(iconoVacio);
                        }
                        laberinto[objPacMan.x][objPacMan.y] = new PacMan(objPacMan.x, objPacMan.y, nivel, "src/imagenes/pacman2R.png");
                        panelJuego.add(laberinto[objPacMan.x][objPacMan.y]);

                    }
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
