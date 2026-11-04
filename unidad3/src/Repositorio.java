import java.util.Locale;
import java.util.Scanner;

public class Repositorio {
    //Funciones de reutilización
    //Función para ingresar un número entero
    public static int ingresarEntero (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        int numero= sc.nextInt();
        return numero;
    }
    //Función para ingresar un número decimal
    public static double ingresarDecimal (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        double numero= sc.nextDouble();
        return numero;
    }
    //Función para ingresar una cadena de texto
    public static String ingresarTexto (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        String texto= sc.nextLine().toLowerCase();
        return texto;
    }
    //Función para ingresar un caracter
    public static char ingresarCaracter (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        char caracter= sc.nextLine().charAt(0);
        return caracter;
    }
    //Función para ingresar un valor booleano
    public static boolean ingresarBooleano (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        boolean valor= sc.nextBoolean();
        return valor;
    }
    //Función para mostrar un mensaje en pantalla
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //Función para determinar si una letra es una vocal
    public static boolean determinarVocal(char letra){
        boolean esVocal=false;
        if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
            esVocal=true;
        }
        return esVocal;
    }
    //Función para ingresar los elementos de un arreglo de tipo String
    public static String [] ingresarArregloTexto(int longitud, String mensaje){
        String [] nuevoArreglo= new String[longitud];
        for(int i=0; i<longitud; i++){
            nuevoArreglo[i]= Repositorio.ingresarTexto(mensaje+(i+1)+" de "+longitud+": ");
        }
        return nuevoArreglo;
    }
    //Función para ingresar los elementos de un arreglo de tipo decimal
    public static double [] ingresarArregloDecimal(int longitud, String mensaje){
        double [] nuevoArreglo= new double[longitud];
        for(int i=0; i<longitud; i++){
            nuevoArreglo[i]= Repositorio.ingresarDecimal(mensaje+(i+1)+" de "+longitud+": ");
        }
        return nuevoArreglo;
    }
    //Función para ingresar los elementos de un arreglo de tipo entero
    public static int [] ingresarArregloEntero(int longitud, String mensaje){
        int [] nuevoArreglo= new int[longitud];
        for(int i=0; i<longitud; i++){
            nuevoArreglo[i]= Repositorio.ingresarEntero(mensaje+(i+1)+" de "+longitud+": ");
        }
        return nuevoArreglo;
    }
    //Función para ingresar los elementos de un arreglo de tipo booleano
    public static boolean [] ingresarArregloBoolean(int longitud, String mensaje){
        boolean [] nuevoArreglo= new boolean[longitud];
        for(int i=0; i<longitud; i++){
            nuevoArreglo[i]= Repositorio.ingresarBooleano(mensaje+(i+1)+" de "+longitud+": ");
        }
        return nuevoArreglo;
    }

}
