public class Multiplicar {
    public static void main(String[] args) {
        //El for se usa para comparar y verificar que nada mas se va a poner las tablas.
        for(int i=1; i<=10 ; i++){
            System.out.println("La tabla del:" + i);
            //El if ses para comparar la tablas y si se encuentra con la tabla del 5 la quita y continua con la otra tabla
            if (i==5) {
                continue;
            }
            for (int j=1; j<=10 ; j++ ) {
                if (j==5) {
                    continue;
                }
                System.out.println(i + "  X  " + j + "=" + (i*j) );
            }
        }
    }
}
