public class MayorMenor {
    static void main() {
        int longitud= Repositorio.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        int[] numeros= Repositorio.ingresarArregloEntero(longitud, "Ingrese el número ");
        int mayor= determinarNumeroMayor(numeros);
        int menor= determinarNumeroMenor(numeros);
        Repositorio.mostrarMensaje("El número mayor es: "+mayor+" y el número menor es: "+menor);

    }
    public static int determinarNumeroMayor(int[]numeros){
        int mayor=numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>mayor){
                mayor= numeros[i];
            }
        }
        return mayor;
    }
    public static int determinarNumeroMenor(int[]numeros){
        int menor=numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]<menor){
                menor= numeros[i];
            }
        }
        return menor;
    }

}
