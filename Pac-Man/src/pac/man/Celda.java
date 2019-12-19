
package pac.man;


public class Celda{
    public int x , y;
    public String contenido = "[ ]";
    
    public Celda(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Celda(int x, int y, String contenido){
        this.contenido = contenido;
        this.x = x;
        this.y = y;
    }
}