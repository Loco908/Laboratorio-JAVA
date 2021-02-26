//inicio: 8:00
//fin: 11:10
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private int edad;
    private String nombre;

    public Personaje (String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre( String nombre){
        if (nombre.length() > 3 && nombre.length() < 10 ){
            this.nombre = nombre;
        }
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

    public String getDetalle(){
        String detalle = "";
        detalle = nombre + "\t" + edad;
        return detalle;

    }
}