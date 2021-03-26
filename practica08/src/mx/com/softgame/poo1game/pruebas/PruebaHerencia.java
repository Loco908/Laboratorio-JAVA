package mx.com.softgame.poo1game.pruebas;
import java.lang.Math;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia{
    public static void main(String[]args){
        Personaje per01 = new Personaje("Valeria",99);
        Personaje per02 = new Personaje("Octavio");
        Planta plan01 = new Planta("Wendy",10,'B');
        Planta plan02 = new Planta("Ricardo",50);
        Planta plan03 = new Planta("vania",'C');
        Planta plan04 = new Planta("Alan");
        Zombie zom01 = new Zombie("Karen",80,true);
        Zombie zom02 = new Zombie("Eduardo",true);
        Zombie zom03 = new Zombie("Esmeralda");
        Personaje [] personajes = {per01,per02,plan03,plan04,zom01,zom02,zom03};  
        for (Personaje j: personajes){
            System.out.println(j.getDetalle());
            if(j instanceof Planta){
                Planta p = (Planta)j;
                System.out.println("Soy planta"+p.getEscudo());
            }
            if(j instanceof Zombie){
                Zombie z = (Zombie)j;
                System.out.println("Soy zombie"+z.getAtaque());
            }
            int res =(int)(Math.random()*10);
            j.decVida(res);
            System.out.println(res);
            System.out.println(j.getDetalle());
           
        }
        
    }


}