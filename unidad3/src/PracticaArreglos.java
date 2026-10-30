public class PracticaArreglos {
    static void main() {

        //Creación de un arreglo vacío
        int[] numeros= new int[5];

        numeros[0]=16;
        numeros[1]=18;
        numeros[2]=20;
        numeros[3]=17;
        numeros[4]=16;

        //Creación de un arreglo lleno de double
        double [] estaturas= {1.6,1.8,1.9,1.67,1.75};
        for(int j=0; j<estaturas.length;j++){
            System.out.println(estaturas[j]);
        }

        System.out.println("---------");

        //Creación de un arreglo lleno de String
        String [] nombres= {"juan","maría","juana","simón"};
        //Recorrer el arreglo nombres
        for(int i=0; i<nombres.length; i++){
            char primerLetra= nombres[i].charAt(0);
            if(primerLetra=='j'){
                System.out.println(nombres[i]);
            }
        }



    }
}
