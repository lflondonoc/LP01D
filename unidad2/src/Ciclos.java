public class Ciclos {
    static void main() {
        String numeros= imprimirNumeros();
        Repositorio.mostrarMensaje(numeros);

    }
    public static String imprimirNumeros(){
        String numeros="";

        int i=20;
        while(i>=10){
            numeros += i+"\n";
            i--;
        }
        return numeros;
    }

}
