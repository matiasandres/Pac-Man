
package pac.man;

import java.util.Scanner;

public class PacMan {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Laberinto lab1 = new Laberinto();
        System.out.println("Nivel de juego: ");
        lab1.nivel = in.nextInt();
        lab1.CrearLaberinto();
        lab1.Rellenar();
//      lab1.laberinto[(int)(Math.random()*(2-0+1))][(int)(Math.random()*(2-0+1))]="[P]";
        lab1.Mostrar();
        
    }
    
}
