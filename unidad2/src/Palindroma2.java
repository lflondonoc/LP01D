public class Palindroma2 {
    static void main() {
        String palabra= Repositorio.ingresarTexto("Ingrese una palabra: ");
        boolean esPalindroma= determinarPalindroma(palabra);
        Repositorio.mostrarMensaje("La palabra "+palabra+"¿es palíndroma?"+esPalindroma);
    }
    public static boolean determinarPalindroma(String palabra){
        boolean esPalindroma=true;

        for(int i=0; i<palabra.length()/2; i++){
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){
                esPalindroma=false;
                break;
            }
        }
        return  esPalindroma;
    }
}
