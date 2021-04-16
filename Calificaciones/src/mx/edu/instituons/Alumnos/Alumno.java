package mx.edu.instituons.Alumnos;

public class Alumno{
    String nombre;
    int[] calificaciones = new int[4];

    public Alumno(String nombre, int[] calificaciones){
        
        public String getNombre(){
            return nombre;
        }

        public int getCalificacion(int c) {
            if(calificaciones[c] == 0){
                return 0;
            }
        }

        public int[] getCalificaciones() {
            return calificaciones;
        }
        public void setCalificacion(int c, int p) {
            if(calificaciones[p] == 0){
                return 0;
            }
        }

        public void setCalificaciones() {
            int random = (int)Math.random();
            calificaciones[random] = random;
        }
    }
}