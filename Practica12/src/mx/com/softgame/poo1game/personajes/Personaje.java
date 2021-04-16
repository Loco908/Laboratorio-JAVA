
package mx.com.softgame.poo1game.personajes;
import static mx.com.softgame.poo1game.Utils.Utileria.*;
public abstract class Personaje{
    protected String nombre;
    protected int vida;
    protected final int id;
    public Personaje(int id){
        this.id = getID();
    }
    public Personaje(String nombre,int vida){
        this.nombre = nombre;
        this.vida= vida;
        id = getID();
        
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida= 3;    
        id = getID();
    }
    
    public void decVida(){
        decVida(1);
    }
    public void decVida(int menosVida){
        if((vida-menosVida)>0){
            vida = vida-menosVida;
        }
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        if((vida>0) && (vida<100)){
            this.vida = vida;
        }
    }
    public abstract void setNombre(String nombre);
    /*{
        if(nombre.length()>3 && nombre.length()<10 ){
            this.nombre = nombre;
        }
    }*/
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO "+nombre);
    }
    public String toString(){
        return "["+id+"]"+"\t"+nombre+"\t"+"("+vida+")"; 
    }
    public abstract boolean equals(Object x);
    /*{
        boolean resultado = false;
        if ( (x != null) && (x instanceof Personaje) ) {
            Personaje p = (Personaje) x;
            if ( (this.nombre.equals(p.nombre)) && (vida == p.vida)){
                return true;
            }   
        }return resultado;
    }*/
    public final String getIdVida(){
        return id+" "+vida;
    }

}