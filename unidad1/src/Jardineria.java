import java.util.Scanner;

public class Jardineria {

    static void main() {

        Scanner sc= new Scanner(System.in);

        //1.Ingresar la longitud
        System.out.print("Ingrese la longitud: ");
        int longitud= sc.nextInt();

        //2.Ingresar el ancho
        System.out.print("Ingrese el ancho: ");
        int ancho= sc.nextInt();

        //3.Calcular el superficie
        int superficie= longitud*ancho;

        //4.Generar mensaje
        String mensaje= "El valor de la longitud es: "+longitud+", el valor del ancho es: "+ancho+". Por lo tanto, el valor de la superficier es: "+superficie;

        //5.Mostrar mensaje
        System.out.println(mensaje);



    }
}
