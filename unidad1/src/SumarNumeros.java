public class SumarNumeros {
    static void main() {
        //Sumar dos números
        int numero1= Repositorio.ingresarEntero("Ingrese el primer número: ");
        int numero2= Repositorio.ingresarEntero("Ingrese el segundo número: ");
        int suma= sumarNumeros(numero1, numero2);
        Repositorio.mostrarMensaje("La suma de los dos números es: "+suma);

    }
    //Función para sumar dos números
    public static int sumarNumeros(int numero1, int numero2){
        int suma= numero1+numero2;
        return suma;
    }

}
