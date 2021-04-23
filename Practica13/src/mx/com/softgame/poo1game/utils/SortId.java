package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import java.util.Comparator;

public class SortId implements Comparator<Personaje>{
    public int compare(Personaje o1, Personaje o2){
        if(o1.getId()==o2.getId()){
            return 0;
        }
        return (o1.getId() > o2.getId()) ? 1 : -1;
    }
}    


