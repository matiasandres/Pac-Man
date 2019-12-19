
package pac.man;

public class Laberinto{
    public Celda[][] laberinto;
    public Celda celdas;
    public int alto, ancho;
    public int nivel;
    public Alimenticia alimenticia;
    
    
    public void CrearLaberinto(){
        switch(nivel){
            case 1: 
                alto = 3;
                ancho = 3;
                break;
            case 2:
                alto = 4;
                ancho = 5;
                break;
            case 3:
                alto = 5;
                ancho = 6;
                break;
        }
        laberinto = new Celda[alto][ancho];
        celdas = new Celda(0 ,0);
        
        for (int i = 0;i < alto; i++){
            for(int j = 0; j < ancho; j++){
                celdas.x=i;
                celdas.y=j;
                laberinto[i][j] = celdas;
            }
        }
    }
    public void Rellenar(){
        int i = 0;
        switch(nivel){
            case 1: 
                while(i < 3){
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if(!laberinto[alimenticia.fruta.x][alimenticia.fruta.y].contenido.equals(alimenticia.fruta.contenido)){
                        laberinto[alimenticia.fruta.x][alimenticia.fruta.y] = alimenticia.fruta;
                        i++;
                    }
                }
                break;
            case 2:
                while(i < 5){
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if(!laberinto[alimenticia.fruta.x][alimenticia.fruta.y].contenido.equals(alimenticia.fruta.contenido)){
                        laberinto[alimenticia.fruta.x][alimenticia.fruta.y] = alimenticia.fruta;
                        i++;
                    }
                }
                break;
            case 3:
                while(i < 7){
                    alimenticia = new Alimenticia((int) (Math.random() * alto), (int) (Math.random() * ancho));
                    if(!laberinto[alimenticia.fruta.x][alimenticia.fruta.y].contenido.equals(alimenticia.fruta.contenido)){
                        laberinto[alimenticia.fruta.x][alimenticia.fruta.y] = alimenticia.fruta;
                        i++;
                    }
                }
                break;
        }
    }
    public void Mostrar(){
        for(int i = 0; i < alto; i++){
            for(int j = 0; j < ancho; j++){
                System.out.print(laberinto[i][j].contenido);
            }
            System.out.println("");
        }
    }
}