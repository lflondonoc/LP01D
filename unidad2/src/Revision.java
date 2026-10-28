public class Revision {
    static void main() {
        imprimirMenuCalculadora();
    }
    public static void imprimirMenuCalculadora() {
        int opcion = 0;

        do {
            Repositorio.mostrarMensaje("===CALCULADORA===");
            Repositorio.mostrarMensaje("1.Sumar números.");
            Repositorio.mostrarMensaje("2.Restar números.");
            Repositorio.mostrarMensaje("3.Multiplicar números.");
            Repositorio.mostrarMensaje("4.Dividir números.");
            Repositorio.mostrarMensaje("5.Salir del programa.");

            opcion = Repositorio.ingresarEntero("Elija la opción: ");

            switch (opcion) {
                case 1:
                    Repositorio.mostrarMensaje("===SUMAR NÚMEROS===");
                    int numero1 = Repositorio.ingresarEntero("Ingrese el primer número: ");
                    int numero2 = Repositorio.ingresarEntero("Ingrese el segundo número: ");
                    int suma = sumarNumeros(numero1, numero2);
                    Repositorio.mostrarMensaje("La suma de " + numero1 + " + " + numero2 + " = " + suma);
                    break;
                case 2:
                    Repositorio.mostrarMensaje("===RESTA NUMEROS===");
                    int numeroa1 = Repositorio.ingresarEntero("ingrese el primer numero");
                    int numeroa2 = Repositorio.ingresarEntero("ingrese el primer numero");
                    int resta = restarNumeros(numeroa1, numeroa2);
                    Repositorio.mostrarMensaje("La resta de " + numeroa1 + "-" + numeroa2 + "=" + resta);
                    break;
                case 3:
                    Repositorio.mostrarMensaje("=== MULTIPLICAR NÚMEROS ===");
                    int numeroM1 = Repositorio.ingresarEntero("Ingrese el primer número: ");
                    int numeroM2 = Repositorio.ingresarEntero("Ingrese el segundo número: ");
                    int multiplicacion = multiplicarNumeros(numeroM1, numeroM2);
                    Repositorio.mostrarMensaje("La multiplicación de " + numeroM1 + " * " + numeroM2 + " = " + multiplicacion);
                    break;
                case 4:
                    int numeroD1 = 0;
                    int numeroD2 = 0;
                    if (numeroD2 == 0) {
                        Repositorio.mostrarMensaje("No se puede dividir entre cero.");
                    } else {
                        Repositorio.mostrarMensaje("=== DIVIDIR NÚMEROS ===");
                        numeroD1 = Repositorio.ingresarEntero("Ingrese el primer número: ");
                        numeroD2 = Repositorio.ingresarEntero("Ingrese el segundo número: ");
                        int division = dividirNumeros(numeroD1, numeroD2);
                        Repositorio.mostrarMensaje("La división de " + numeroD1 + " / " + numeroD2 + " = " + division);
                    }
                    break;
                case 5:
                    Repositorio.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    Repositorio.mostrarMensaje("La opción no es válida..");
            }
        }while (opcion != 5) ;

    }
public static int sumarNumeros(int numero1, int numero2){
    int suma= numero1+numero2;
    return suma;
}
public static int restarNumeros(int numero1, int numero2){
    int resta= numero1-numero2;
    return resta;
}
public static int multiplicarNumeros(int numero1, int numero2){
    int multiplicacion= numero1*numero2;
    return multiplicacion;
}
public static int dividirNumeros(int numero1, int numero2){
    int division= numero1/numero2;
    return division;
}


}

