public class Palindroma {
    static void main() {
        String palabra= Repositorio.ingresarTexto("Ingrese la palabra: ");
        boolean esPalindroma= determinarPalindroma(palabra);
        Repositorio.mostrarMensaje("La palabra "+palabra+" ¿es palíndroma?: "+esPalindroma);

    }
    public static boolean determinarPalindroma(String palabra){
        boolean esPalindroma=false;
        String palabraInvertida="";

        for(int i=palabra.length()-1; i>=0; i--){
            palabraInvertida+=palabra.charAt(i);
        }
        if(palabra.equals(palabraInvertida)){
            esPalindroma=true;
        }
        return esPalindroma;
    }
}
