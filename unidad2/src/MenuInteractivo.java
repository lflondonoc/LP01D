public class MenuInteractivo {
    static void main() {
        imprimirMenu();

    }
    public static void imprimirMenu(){
        int opcion=0;
        do{
            Repositorio.mostrarMensaje("===BIENVENIDOS===");
            Repositorio.mostrarMensaje("1. Mostrar el número mayor de un número entero.");
            Repositorio.mostrarMensaje("2. Mostrar la cantidad de dígitos pares de un número entero.");
            Repositorio.mostrarMensaje("3. Verificar si una palabra es palíndroma.");
            Repositorio.mostrarMensaje("4. Verificar si un número es capicúa.");
            Repositorio.mostrarMensaje("5. Salir.");

            opcion= Repositorio.ingresarEntero("Elija una opción: ");
            switch (opcion){
                case 1:
                    int numero= Repositorio.ingresarEntero("Ingrese un número: ");
                    Repositorio.mostrarMensaje("El número mayor de "+numero+" es: "+NumeroMayorMenor.determinarMayor(numero));
                    break;
                case 2:
                    int numero2= Repositorio.ingresarEntero("Ingrese un número: ");
                    int numerosPares= contarPares(numero2);
                    Repositorio.mostrarMensaje("La cantidad de números de pares del número "+numero2+" es: "+numerosPares);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Repositorio.mostrarMensaje("Saliendo de programa.....");
                    break;
                default:
                    Repositorio.mostrarMensaje("Lo siento, la opción no es válida.");
            }

        }while(opcion!=5);
    }
    public static int contarPares(int numero){
        int contadorPares=0;

        int i=numero;
        while(i>0){
            int ultimoNumero=i%10;
            if(ultimoNumero%2==0){
                contadorPares=contadorPares+1;
            }
            i/=10;
        }
        return contadorPares;
    }
    public static boolean determinarPalindroma(String palabra){
        boolean esPalindroma=false;
        String palabraInvertida="";

        for(int i=palabra.length()-1; i>=0; i--){
            palabraInvertida+=palabra.charAt(i);
        }
        if(palabra.equals(palabraInvertida)){
            esPalindroma=true;
        }
        return esPalindroma;
    }
}
