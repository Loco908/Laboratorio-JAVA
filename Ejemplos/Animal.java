public class Animal {
    private int raza;
    private String nombre;
    public Animal(int raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }
    public String getDatos(){
        return nombre + "\t" + raza;
    }
}
