package clases;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Celda extends JLabel {

    String nombre;
    String ruta = "src/imagenes/celda1.png";
    ImageIcon contenido;
    int x, y;

    public Celda(int x, int y, int nivel) {
        nombre = "Celda";
        this.x = x;
        this.y = y;
        contenido = new ImageIcon(ruta);
        setIcon(contenido);//Le incerta una imagen a la "Celda" que hereda de "JLabel"
        PosicionMargen(x, y, nivel);//Coloca las celdas en sus coordenadas, con un margen diferente para cada nivel.
        setVisible(true);//Muestra la "Celda"
    }

    public Celda(int x, int y, int nivel, String nombre , String ruta) {
        this.x = x;
        this.y = y;
        this.ruta = ruta;
        contenido = new ImageIcon(ruta);
        setIcon(contenido);//Le incerta una imagen a la "Celda" que hereda de "JLabel"
        PosicionMargen(x, y, nivel);//Coloca las celdas en sus coordenadas, con un margen diferente para cada nivel.
        setVisible(true);//Muestra la "Celda"
    }

    public final void PosicionMargen(int x, int y, int nivel) {
        if (nivel == 1) {
            setBounds(180 + (x * 30), (y * 30), 30, 30);//Nivel 1; Margen = 180
        }
        if (nivel == 2) {
            setBounds(90 + (x * 30), (y * 30), 30, 30);//Nivel 2; Margen = 90
        }
        if (nivel == 3) {
            setBounds((x * 30), (y * 30), 30, 30);//Nivel 3; Margen = 0
        }
    }
}
