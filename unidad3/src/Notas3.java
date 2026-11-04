public class Notas3 {
    static void main() {
        int longitud= Repositorio.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        String []nombres= Repositorio.ingresarArregloTexto(longitud, "Ingrese el nombre ");
        double[]notas= Repositorio.ingresarArregloDecimal(longitud, "Ingrese la nota ");
        int contador= contarNotasMayores3(notas);
        String[]nuevoArregloNombres= determinarNombresNotasMayores3(nombres,notas,contador);
        double[]nuevoArregloNotas= determinarNotasMayores3(notas,contador);
        String mensaje= mostrarNuevoArreglo(nuevoArregloNombres, nuevoArregloNotas);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static int contarNotasMayores3(double []notas){
        int contador=0;
        for (int i=0; i<notas.length;i++){
            if(notas[i]>3){
                contador++;
            }
        }
        return  contador;
    }
    public static String [] determinarNombresNotasMayores3(String []nombres, double[]notas, int contador){
        String []nuevoArreglo= new String[contador];
        int j=0;

        for (int i=0; i<nombres.length; i++){
            if(notas[i]>3){
                nuevoArreglo[j]=nombres[i];
                j++;
            }
        }
        return  nuevoArreglo;
    }

    public static double [] determinarNotasMayores3(double[]notas, int contador){
        double []nuevoArreglo= new double[contador];
        int j=0;

        for (int i=0; i<notas.length; i++){
            if(notas[i]>3){
                nuevoArreglo[j]=notas[i];
                j++;
            }
        }
        return  nuevoArreglo;
    }

    public static String mostrarNuevoArreglo(String []nuevoArregloNombres, double[]nuevoArregloNotas){
        String mensaje= "Los estudiantes con nota mayor a 3 son: \n";
        for (int i=0; i<nuevoArregloNombres.length;i++){
            mensaje+="-"+nuevoArregloNombres[i]+" con una nota de "+nuevoArregloNotas[i]+"\n";
        }
        return mensaje;
    }

}
