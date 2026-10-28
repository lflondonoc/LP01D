import java.util.Scanner;

public class Calculadora {
    static void main() {
        imprimirMenuCalculadora();

    }
    public static void imprimirMenuCalculadora(){
        int opcion=0;
        int numero1=0;
        int numero2=0;

        do{
            Repositorio.mostrarMensaje("===CALCULADORA===");
            Repositorio.mostrarMensaje("1.Sumar números.");
            Repositorio.mostrarMensaje("2.Restar números.");
            Repositorio.mostrarMensaje("3.Multiplicar números.");
            Repositorio.mostrarMensaje("4.Dividir números.");
            Repositorio.mostrarMensaje("5.Salir del programa.");

            opcion= Repositorio.ingresarEntero("Elija la opción: ");
            if(opcion >=1 && opcion <=4){
                numero1= Repositorio.ingresarEntero("Ingrese el primer número: ");
                numero2= Repositorio.ingresarEntero("Ingrese el segundo número: ");
            }

            switch (opcion){
                case 1:
                    int suma= sumarNumeros(numero1,numero2);
                    Repositorio.mostrarMensaje("La suma de "+numero1+" + "+numero2+" = "+suma);
                    break;
                case 2:
                    int resta= restarNumeros(numero1,numero2);
                    Repositorio.mostrarMensaje("La resta de "+numero1+" - "+numero2+" = "+resta);
                    break;
                case 3:
                    int multiplicacion= multiplicarNumeros(numero1, numero2);
                    Repositorio.mostrarMensaje("La multiplicación de "+numero1+" * "+numero2+" = "+multiplicacion);
                    break;
                case 4:
                    if(numero2==0){
                        Repositorio.mostrarMensaje("La división no es válida, ingrese un número mayor a 0.");
                    }else{
                        int division= dividirNumeros(numero1,numero2);
                        Repositorio.mostrarMensaje("La división de "+numero1+" / "+numero2+" = "+division);
                    }
                    break;
                case 5:
                    Repositorio.mostrarMensaje("Saliendo del programa......");
                    break;
                default:
                    Repositorio.mostrarMensaje("La opción no es válida..");
            }


        }while(opcion!=5);
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
