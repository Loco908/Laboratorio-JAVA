package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class Planta extends Personaje{
    protected char escudo;
    public Planta(String nombre,int vida,char escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Planta(String nombre,char escudo){
        this(nombre,3,escudo);
    }
    public Planta(String nombre,int vida){
        this(nombre,vida,'A');
    }
    public Planta(String nombre){
        this(nombre,3,'A');
    }
    public  void setNombre(String nombre)
    {
        if(nombre.length()>5 && nombre.length()<10 ){
            this.nombre = nombre;
        }
    }
    public void decVida(){
        if(escudo == 'A'){
            super.decVida(2);
        }
    }
    public void decVida(int menosVida){
        if(escudo == 'A'){
            super.decVida(menosVida*2);
        }
        
    }
    public char getEscudo(){
        return escudo;
    } 
    public String toString(){
        return super.toString()+" {"+escudo+"}";
    }
    public boolean equals(Object x){
        boolean resultado = false;
        if ( (x != null) && (x instanceof Planta) ) {
            Planta pl = (Planta) x;
            if ( (this.nombre.equals(pl.nombre)) && (vida == pl.vida)&&(escudo == pl.escudo)){
                return true;
            }   
        }return resultado;
    }
    /*public String getIdVida(){
        return getIdVida()+""+escudo;//el metodo del padre es final y no se puede modificar
    }*/

}