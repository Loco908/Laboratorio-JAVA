package mx.com.softgame.poo1game.pruebas;
import java.lang.Math;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia{
    public static void main(String[]args){
        /*Personaje per01 = new Personaje("Valeria",99);
        Personaje per02 = new Personaje("Octavio");
        Planta plan01 = new Planta("Wendy",10,'B');
        Planta plan02 = new Planta("Ricardo",50);
        Planta plan03 = new Planta("vania",'C');
        Planta plan04 = new Planta("Alan");
        Zombie zom01 = new Zombie("Karen",80,true);
        Zombie zom02 = new Zombie("Eduardo",true);
        Zombie zom03 = new Zombie("Esmeralda");
        */
        Personaje[] personajes = {new Personaje("Omar",99),
        new Planta("Karen",50), new Zombie("Hanna",80,false),
        new Personaje("Omar",99),new Planta("Karen",50),new Zombie("Hanna",80,false),
        new Planta("Jaime",5,'A')};
        int i =0;
        System.out.println(personajes[2].getIdVida());
        while(i<personajes.length){
            
            for(Personaje p : personajes){
                if(p == personajes[i]){
                    System.out.println(personajes[i].toString()
                        +"es identico a "+p.toString()
                        +", son el mismo objeto***");
                        continue;
                    }
                if(p.equals(personajes[i])){
                    System.out.println(personajes[i].toString()
                        +"es igual a "+p.toString()
                        +", son diferentes objetos**");
                        continue;
                    }System.out.println(personajes[i].toString()
                        +"!="+p.toString());
                    
                    
            
            }System.out.println("............................");   
            i++;
            
        }
        
        
    }


}