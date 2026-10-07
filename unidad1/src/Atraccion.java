import java.util.Scanner;

public class Atraccion {

    public static final int EDAD=18;
    public static final double ESTATURA=1.70;

    static void main() {

        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        String entrada= determinarEntrada(edad);
        Repositorio.mostrarMensaje(entrada);

    }
    public static String determinarEntrada(int edad){
        String mensaje="";
        if(edad>=EDAD){
            double estatura= Repositorio.ingresarDecimal("Ingrese la estatura: ");
            if(estatura>=ESTATURA){
                mensaje = "Puede ingresar a la atracción!!!!";
            }else{
                mensaje = "No puede ingresar, estatura no válida";
            }
        }else{
            mensaje = "No puede ingresar a la atracción, es menor edad.";
        }
        return mensaje;
    }

}
