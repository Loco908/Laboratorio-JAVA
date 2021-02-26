public class PruebaArreglos {
    public static void main(String[] args) {
        int arreglo [] = new int[5];
        arreglo [0] = 1;
        arreglo [2] = 8;
        for (int i=0;i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        Animal arreglo2[] = new Animal[3];
        arreglo2[0] = new Animal(2,"Vaquita");
        arreglo2[1] = new Perro(6,"Mupy");
        arreglo2[2] = new Gato(3,"Muñeca");
        for(Animal t: arreglo2){
            System.out.println(t.getDatos());
        }

    }
}
