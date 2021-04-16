//Finalizacion 9:41
package mx.com.softgame.poo1game.pruebas;
import java.lang.Math;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje{
    public static void main(String[]args){
        Personaje per01 = new Personaje("Omar");
        
        Personaje per02 = new Personaje("Erick");
       
        Personaje per03 = new Personaje("Wendy");
       
        Personaje per04 = new Personaje("Lesly");
        outfor:
        for(int i=0;i<3;i++){
            int ed = (int)(Math.random()*250);
            if(per01.setVida(ed)){
                System.out.println(per01.getDetalle()+" se modifico la edad");
            }else{
                System.out.println(per01.getDetalle()+" sin modificacion de edad a "+ed);
            }
            ed = (int)(Math.random()*250);
            if(per02.setVida(ed)){
                System.out.println(per02.getDetalle()+" se modifico la edad");
            }else{
                System.out.println(per02.getDetalle()+" sin modificacion de edad a "+ed);
            }
            ed = (int)(Math.random()*250);
             if(per03.setVida(ed)){
                System.out.println(per03.getDetalle()+" se modifico la edad ");
            }else{
                System.out.println(per03.getDetalle()+" sin modificacion de edad a "+ed);
            }
            do{
                ed = (int)(Math.random()*250);
                System.out.println(ed);
                if(ed==150){ 
                    System.out.println("**Bingo 150**");
                    continue outfor;
                }

            }while(!per04.setVida(ed));
        }
            System.out.println(per04.getDetalle()+"\n");
    }       
}