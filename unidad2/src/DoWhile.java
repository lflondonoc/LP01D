public class DoWhile {
    static void main() {
        String mensaje= imprimiPalabra();
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String imprimiPalabra(){
        String mensaje="";
        int i=1;
        do{
            mensaje+="hola"+"\n";
            i++;
        }while(i<=5);
        return mensaje;
    }
}
