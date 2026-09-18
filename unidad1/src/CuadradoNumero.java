public class CuadradoNumero {

    //Constante
    public static final int NUMERO=5;

    static void main() {
        //1. Ingresar un número entero
        int numero= Repositorio.ingresarEntero("Ingrese un número: ");
        //2. Calcular el cuadrado
        int resultado= calcularCuadrado(numero);
        //3. Generar y mostrar mensaje
        Repositorio.mostrarMensaje("El resultado: "+resultado);

    }
    //Función de tipo entero y se va a llamar calcular cuadrado
    //Cómo parámetro van a colocar un número entero
    //Dentro de la función van a crear una variable de tipo entero
    //La variable va a obtener el cuadrado del número + 5
    //Retornamos la variable

    public static int calcularCuadrado(int numero){
        int resultado= (numero*numero)+NUMERO;
        return resultado;
    }

}
