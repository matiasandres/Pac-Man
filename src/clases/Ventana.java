package clases;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Pac-Man");//Le da el titulo a la ventana
        setSize(850, 480);//Dimensiones de la ventana
        setLayout(null);//Para dar las dimensiones manualmente
        setLocationRelativeTo(null);//Para que la ventana aparezca en el centro de la pantalla
        setResizable(false);//Impide al usuario ajustar el tamalo de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cierra el programa y los procesos al darle a la x
    }
}
