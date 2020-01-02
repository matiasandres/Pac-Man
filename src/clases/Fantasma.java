package clases;

import javax.swing.ImageIcon;

public class Fantasma extends Personaje {

    public Fantasma(int x, int y, int nivel, int j) {
        nombre = "fantasma";
        imagen = new ImageIcon("src/imagenes/fantasma" + j + ".png");
    }
}
