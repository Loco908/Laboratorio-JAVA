
package mx.com.softgame.poo1game.personajes;
import java.io.Serializable;
import  mx.com.softgame.poo1game.utils.Utileria.*;
public abstract class Personaje  implements Comparable < Personaje > ,Serializable {
    protected String nombre;
    protected int vida;
    protected final int id;
    public Personaje(int id){
        this.id = getId();
    }
    public Personaje(String nombre,int vida){
        this.nombre = nombre;
        this.vida= vida;
        id = getId();
        
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida= 3;    
        id = getId();
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
    public int getId(){
        return id;
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
    
    public int compareTo (Personaje p){
        //Personaje p=null;
        
        int valor = nombre.compareTo(p.nombre);
        if (valor !=0) {
            return valor;
        }
        return p.vida-vida;
        
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
    public int hashCode(){
        return nombre.hashCode()+vida*7;
    }
    /*
    public int compareTo(Personaje p){
        int valor = nombre.compareTo(p.nombre);
        if(valor !=0){
            return valor;
        }
        return id -p.id;
    }*/

}