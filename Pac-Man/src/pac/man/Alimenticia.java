
package pac.man;

public class Alimenticia extends Fruta{
    public Alimenticia(int x, int y){
        super();
        this.fruta = new Celda(x, y, "[F]");
        this.efecto = 2;
    }
}
