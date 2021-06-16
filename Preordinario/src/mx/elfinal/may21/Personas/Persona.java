public abstract class Persona implements Comparable<Persona> {
    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String toString() {
        return nombre +" "+apellido;
    }
    public boolean equals(Object o) {
        boolean resultado = false;
        if(o!= null && o instanceof Persona){
            Persona p = (Persona) o;
            if((nombre == p.nombre) && (apellido == p.apellido)){
                resultado = true;
            }
        }
        return resultado;
    }

    public int compareTo(Persona p) {
        if(nombre.compareTo(p.apellido))
    }

}
