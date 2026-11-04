public class Notas2 {
    static void main() {
        int longitud= Repositorio.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        String []nombres= Repositorio.ingresarArregloTexto(longitud, "Ingrese el nombre ");
        double[]notas= Repositorio.ingresarArregloDecimal(longitud, "Ingrese la nota ");
        String mensaje= imprimirNombresNotaMayor3(nombres, notas);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String imprimirNombresNotaMayor3(String[]nombres, double[]notas){
        String mensaje="Los estudiantes que tienen una notas por encima de 3 son:\n";
        for(int i=0; i<nombres.length; i++){
            if(notas[i]>3){
                mensaje+="-"+nombres[i]+" con una nota de "+notas[i]+"\n";
            }
        }
        return mensaje;
    }
}
