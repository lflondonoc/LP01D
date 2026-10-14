public class Factorial {
    static void main() {
        int numero= Repositorio.ingresarEntero("Ingrese un número: ");
        int factorial= calcularFactorial(numero);
        Repositorio.mostrarMensaje("El factorial de !"+numero+" = "+factorial);

    }
    public static int calcularFactorial(int numero){
        int factorial=1;

        int i=1;
        while(i<=numero){
            factorial= factorial*i;
            i+=1;
        }
        return factorial;
    }
}
