public class Notas {
    static void main() {
        String [] nombres={"Sara", "Santiago","Marlon","Valery","David","Miguel"};
        double [] notas= {3.4,4,2.8,3.2,1.8,4.5};
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
