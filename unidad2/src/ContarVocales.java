public class ContarVocales {
    static void main() {
        String nombre= Repositorio.ingresarTexto("Ingrese un nombre: ");
        int cantidadVocales= contarVocales(nombre);
        int cantidadConsonantes= contarConsonantes(nombre);
        Repositorio.mostrarMensaje("La cantidad de vocales del nombre "+nombre+" es: "+cantidadVocales+" y la cantidad de consonantes es: "+cantidadConsonantes);

    }
    public static int contarVocales(String nombre){
        int cantidadVocales=0;
        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(Repositorio.determinarVocal(letra)){
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }
    public static int contarConsonantes(String nombre){
        int cantidadConsonantes=0;
        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(!Repositorio.determinarVocal(letra)){
                cantidadConsonantes++;
            }
        }
        return cantidadConsonantes;
    }
}
