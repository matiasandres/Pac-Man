package pac.man;

import java.util.Scanner;

public class PacMan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Laberinto lab1 = new Laberinto();
        System.out.println("Nivel de juego: ");
        lab1.setNivel(in.nextInt());
        lab1.Mostrar();
    }

}
