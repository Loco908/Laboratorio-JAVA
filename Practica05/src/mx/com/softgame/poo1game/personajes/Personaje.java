//Luis Eduardo
//Hora de inicio: 8:00
//hora de terminado: 8:30
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private int edad;
    private String nombre;

    public Personaje (String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre( String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }

    public boolean setEdad(int edad){
        if(edad >= 0 && edad <=120){
            this.edad = edad;
            return true;
        }else{
            return false;}
        }

    public void saludar(){
        System.out.println("Hola Alumno de POO" +"    "+  nombre);
    }
}