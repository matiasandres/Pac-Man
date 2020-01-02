package clases;

import javax.swing.ImageIcon;

public class PacMan extends Personaje {

    int vida = 5;

    public PacMan(int x, int y, int nivel, char direccion) {
        nombre = "PacMan";
        imagen = new ImageIcon("src/imagenes/pacman2" + direccion + ".png");
        objCelda = new Celda(x, y, nivel);
        objCelda.setIcon(imagen);
        objCelda.setVisible(true);
    }
}
