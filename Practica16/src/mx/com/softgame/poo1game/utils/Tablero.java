package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import  mx.com.softgame.poo1game.utils.TheException;
public class Tablero {
    static int MAX_LINE = 10;
    private static int  idx= -1;
    static private Personaje[] personajes = new Personaje [MAX_LINE];
    
    private Tablero(int MAX_LINE,int idx){
        this.MAX_LINE = MAX_LINE;
        this.idx = idx;
    }
    public static void addPersonaje(Personaje p) throws TheException{
        boolean temp = false;
            if((idx+1) >= 0 && idx+1< MAX_LINE ){
                personajes[idx+1]=p;
                idx++;
            }else{
            throw new TheException("No es posible insetar el personaje", idx);
            }
        }
    
    public static void delPersonaje(Personaje p) throws TheException{
        boolean temp = false;
        if((idx- 1)>= 0 && (idx-1) < MAX_LINE){
            personajes[idx]=null;
            idx--;
            
        }else{
            throw new TheException("No es posible borrar el personaje", idx-1);
        }
        // Error en el catch falta throw
        
        
    }
    public static void showAll(){
        for(Personaje pe :personajes){
            if(pe!=null){
                System.out.println(pe.getNombre());
            }else{
                System.out.println("-");
            }
            
        }

    }

}
