public class CantidadParesImpares {
    static void main() {
        String mensaje= mostrarParesImpares();
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String mostrarParesImpares(){
        //Contadores: par e impar
        int contadorPares=0;
        int contadorImpares=0;

        //Inicio de ciclo
        int i=1;
        while(i<=5){
            if(i%2==0){
                contadorPares= contadorPares+1;
            }else{
                contadorImpares=contadorImpares+1;
            }
            i++;
        }
        String mensaje="La cantidad de pares de 1 al 5 : "+contadorPares+" y la cantidad de impares es: "+contadorImpares;
        return mensaje;
    }
}
