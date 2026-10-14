public class CantidadImpares {
    static void main() {
        int contadorImpares= contarImpares();
        int contadorPares= contarPares();
        Repositorio.mostrarMensaje("La cantidad de impares del 1 al 5 es: "+contadorImpares+" y la cantidad de pares es: "+contadorPares);

    }
    public static int contarImpares(){
        int contadorImpares=0;

        int i=1;
        while(i<=5){
            if(i%2!=0){
                contadorImpares=contadorImpares+1;
            }
            i+=1;
        }
        return contadorImpares;
    }
    public static int contarPares(){
        int contadorPares=0;

        int i=1;
        while(i<=5){
            if(i%2==0){
                contadorPares=contadorPares+1;
            }
            i+=1;
        }
        return contadorPares;
    }
}
