
package pac.man;

public class Laberinto{
    public String[][] laberinto;
    
    public void Crear(){
        laberinto = new String[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                laberinto[i][j]="[ ]";
            }
        }
    }
    public void Mostrar(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(laberinto[i][j]);
            }
            System.out.println("");
        }
    }
}