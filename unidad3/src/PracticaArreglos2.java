public class PracticaArreglos2 {
    static void main() {
        double [] estaturas= {1.6,1.8,1.9,1.67,1.75};
        String [] nombres= {"juan","maría","juana","simón"};
        String mensajeEstauras= imprimirEstaturas(estaturas);
        Repositorio.mostrarMensaje(mensajeEstauras);
        String mensajeNombres= imprimirNombresJ(nombres);
        Repositorio.mostrarMensaje(mensajeNombres);

    }
    public static String imprimirEstaturas(double[] estaturas){
        String mensaje="Las estaturas son: \n";
        for(int j=0; j<estaturas.length;j++){
            mensaje+=estaturas[j]+"\n";
        }
        return  mensaje;
    }
    public static String imprimirNombresJ(String[] nombres){
        String mensaje= "Los nombres que empiezan por la letra j son: \n";
        for(int i=0; i<nombres.length; i++){
            char primerLetra= nombres[i].charAt(0);
            if(primerLetra=='j'){
                mensaje+="-"+nombres[i]+"\n";
            }
        }
        return  mensaje;
    }
}
