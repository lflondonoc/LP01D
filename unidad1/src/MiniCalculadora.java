public class MiniCalculadora {
    static void main() {

        int numero1= Repositorio.ingresarEntero("Ingrese el primer número: ");
        int numero2= Repositorio.ingresarEntero("Ingrese el segundo número: ");
        char operacion= Repositorio.ingresarCaracter("Seleccione una de las siguientes opsciones(+,-,*,/): ");
        double resultado= calcularOperacion(numero1,numero2, operacion);
        Repositorio.mostrarMensaje("El resultado de la operación "+numero1+" "+operacion+" "+numero2+" = "+resultado);

    }
    public static double calcularOperacion (int numero1, int numero2, char operacion){
        double resultado=0.0;
        switch (operacion){
                case '+':
                    resultado= numero1+numero2;
                    break;
                case '-':
                resultado= numero1-numero2;
                break;
            case '*':
                resultado= numero1*numero2;
                break;
            case '/':
                resultado= numero1/(double)numero2;
                break;
        }
        return resultado;
    }
}
