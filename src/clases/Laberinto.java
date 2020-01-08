package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class Laberinto {

    static Celda[][] laberinto; //Variable para la matriz de "Celda"
    static PanelJuego panelJuego;//Variable para el panel
    static int nivel = 1;
    Celda celda;
    Pared objPared;
    Alimenticia objFrutaA;
    Venenosa objFrutaV;
    Fantasma objFantasma;
    PacMan objPacMan;

    public Laberinto() {
        panelJuego = new PanelJuego();//Crea un objeto "PanelJuego" que hereda de "JPanel"
        objPared = new Pared();
        objFrutaA = new Alimenticia();
        objFrutaV = new Venenosa();
        objFantasma = new Fantasma();
        CrearNivel();
        Llenar();
        objPared.Generar(objPared);
        objFrutaA.Generar(objFrutaA);
        objFrutaV.Generar(objFrutaV);
        objFantasma.Generar(objFantasma);
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
                    objPared = new Pared(i, j, nivel);
                    laberinto[i][j] = objPared.getObjCelda();
                }
                panelJuego.add(laberinto[i][j]);
            }
        }
    }

    public final void GenerarPacMan() {

        int x, y;

        int i = 0;
        while (i < 1) {
            x = (int) (Math.random() * (laberinto.length - 2) + 1);
            y = (int) (Math.random() * (laberinto[0].length - 2) + 1);

            objPacMan = new PacMan(x, y, nivel, 'R');
            if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta.equals("src/imagenes/celda1.png")) {

                laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(null);
                laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = null;
                laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = objPacMan.getObjCelda();
                panelJuego.add(laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y]);
                i++;
            }
        }
    }

    public final void MoverPacMan() {
        panelJuego.getVentana().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ImageIcon iconoVacio = new ImageIcon("src/");
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y - 1].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan.getObjCelda().y--;
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una Alimenticia
                            if (objPacMan.getVida() < 5) {
                                objPacMan.setVida(objPacMan.getVida() + 1);
                                System.out.println(objPacMan.getVida());
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una Venenosa
                            if (objPacMan.getVida() > 1) {
                                objPacMan.setVida(objPacMan.getVida() - 1);
                                System.out.println(objPacMan.getVida());
                            }else{
                                System.out.println("Game Over");
                                System.exit(0);
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan = new PacMan(objPacMan.getObjCelda().x, objPacMan.getObjCelda().y, nivel, 'U');
                        laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = objPacMan.getObjCelda();
                        panelJuego.add(laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y]);
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y + 1].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan.getObjCelda().y++;
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una Alimenticia
                            if (objPacMan.getVida() < 5) {
                                objPacMan.setVida(objPacMan.getVida() + 1);
                                System.out.println(objPacMan.getVida());
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una Venenosa
                            if (objPacMan.getVida() > 1) {
                                objPacMan.setVida(objPacMan.getVida() - 1);
                                System.out.println(objPacMan.getVida());
                            }else{
                                System.out.println("Game Over");
                                System.exit(0);
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {

                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan = new PacMan(objPacMan.getObjCelda().x, objPacMan.getObjCelda().y, nivel, 'D');
                        laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = objPacMan.getObjCelda();
                        panelJuego.add(laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y]);
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                    if (laberinto[objPacMan.getObjCelda().x - 1][objPacMan.getObjCelda().y].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan.getObjCelda().x--;
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una Alimenticia
                            if (objPacMan.getVida() < 5) {
                                objPacMan.setVida(objPacMan.getVida() + 1);
                                System.out.println(objPacMan.getVida());
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una Venenosa
                            if (objPacMan.getVida() > 1) {
                                objPacMan.setVida(objPacMan.getVida() - 1);
                                System.out.println(objPacMan.getVida());
                            }else{
                                System.out.println("Game Over");
                                System.exit(0);
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan = new PacMan(objPacMan.getObjCelda().x, objPacMan.getObjCelda().y, nivel, 'L');
                        laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = objPacMan.getObjCelda();
                        panelJuego.add(laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y]);
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (laberinto[objPacMan.getObjCelda().x + 1][objPacMan.getObjCelda().y].ruta != "src/imagenes/pared.png") {
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan.getObjCelda().x++;
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaA.png") {//Cuando se come una Alimenticia
                            if (objPacMan.getVida() < 5) {
                                objPacMan.setVida(objPacMan.getVida() + 1);
                                System.out.println(objPacMan.getVida());
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].ruta == "src/imagenes/frutaV.png") {//Cuando se come una Venenosa
                            if (objPacMan.getVida() > 1) {
                                objPacMan.setVida(objPacMan.getVida() - 1);
                                System.out.println(objPacMan.getVida());
                            }else{
                                System.out.println("Game Over");
                                System.exit(0);
                            }
                        }
                        if (laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] != null && laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].getIcon() != null) {
                            laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y].setIcon(iconoVacio);
                        }
                        objPacMan = new PacMan(objPacMan.getObjCelda().x, objPacMan.getObjCelda().y, nivel, 'R');
                        laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y] = objPacMan.getObjCelda();
                        panelJuego.add(laberinto[objPacMan.getObjCelda().x][objPacMan.getObjCelda().y]);
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
