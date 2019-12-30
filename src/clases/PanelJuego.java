package clases;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelJuego extends JPanel {
    
    private JFrame ventana; //Variable para la ventana

    public PanelJuego() {
        ventana = new Ventana();
        setLayout(null);//Para dar las dimensiones manualmente
        setBounds(0, 0, ventana.getWidth(), ventana.getHeight());//Coloca el panel encima de la ventana
        setBackground(Color.BLACK);//Pone el fondo negro
        setVisible(true);//Lo hace visible
        ventana.add(this);//Agrega el panel a la ventana
    }

    public JFrame getVentana() {
        return ventana;
    }
    
    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }
    


}
