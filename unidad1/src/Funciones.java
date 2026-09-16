import java.util.ResourceBundle;
import java.util.Scanner;

public class Funciones {
    static void main() {
        //Invocar la función -> utilizarla
        int numero1= Repositorio.ingresarEntero("Ingrese el primer número: ");
        int numero2= Repositorio.ingresarEntero("Ingrese el segundo número: ");
        int numero3= Repositorio.ingresarEntero("Ingrese el tercer número: ");
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        double peso= Repositorio.ingresarDecimal("Ingrese su peso: ");
        double estatura= Repositorio.ingresarDecimal("Ingrese su estatura: ");
        String nombre= Repositorio.ingresarTexto("Ingrese su nombre: ");
        String apellido= Repositorio.ingresarTexto("Ingrese su apellido: ");
        boolean estaLloviendo= Repositorio.ingresarBooleano("¿Está lloviendo?:");

    }

}
