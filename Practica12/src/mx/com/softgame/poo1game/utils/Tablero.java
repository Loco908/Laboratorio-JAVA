package mx.com.softgame.poo1game.Utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.utils.TheException;
public class Tablero {
    static int MAX_LINE = 10;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    private Tablero(int MAX_LINE,int idx){
        this.MAX_LINE = MAX_LINE;
        this.idx = idx;
    }
    public static void addPersonaje(Personaje p) throws TheException {
        if(idx){

        }else{
            throw new TheException("No es posible insertar el personaje", idx)
        }


            
        boolean temp = false;
    }
    public static void delPersonaje(Personaje p)throws TheException{
        boolean temp = false;
        if((idx- 1)>= 0 && (idx-1) < MAX_LINE){
            idx--;
            personajes[idx]=null;
        }
        
    }

    public static void showAll(){
        for(Personaje pe :personajes){
            if(pe!=null){
                System.out.println(pe.getNombre());
            }
        }

    }

}
