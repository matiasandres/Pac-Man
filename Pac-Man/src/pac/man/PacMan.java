
package pac.man;


public class PacMan {

    
    public static void main(String[] args) {
        int numero1 = (int)(Math.random()*(2-0+1));
        int numero2 = (int)(Math.random()*(2-0+1));
        Laberinto lab1 = new Laberinto();
        lab1.Crear();
        lab1.laberinto[numero1][numero2]="[P]";
        lab1.Mostrar();
        
    }
    
}
