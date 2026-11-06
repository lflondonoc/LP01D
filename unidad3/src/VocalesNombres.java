public class VocalesNombres {
    static void main() {
        String[]nombres={"juan","camila"};
        String mensaje= contarVocalesNombres(nombres);
        Repositorio.mostrarMensaje(mensaje);
    }
    public static String contarVocalesNombres(String []nombres){
        String mensaje="";
        for (int i=0; i<nombres.length; i++){
            String nombre= nombres[i];

            int contador=0;
            for(int j=0; j<nombre.length();j++){
                char letra= nombre.charAt(j);
                if(Repositorio.determinarVocal(letra)){
                    contador++;
                }
            }
            mensaje+= "El nombre "+nombre+" tiene "+contador+" vocales.\n";
        }
        return mensaje;
    }
}
