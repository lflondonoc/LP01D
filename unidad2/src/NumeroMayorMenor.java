public class NumeroMayorMenor {
    static void main() {
        int numero= Repositorio.ingresarEntero("Ingrese un número entero: ");
        int mayor= determinarMayor(numero);
        int menor= determinarMenor(numero);
        Repositorio.mostrarMensaje("El número mayor de "+numero+" es: "+mayor+ " y el número menor es: "+menor);

    }
    public static int determinarMayor(int numero){
        int mayor=0;

        for(int i=numero; i>0; i/=10){
            int ultimoNumero= i%10;

            if(ultimoNumero>mayor){
                mayor=ultimoNumero;
            }
        }
        return mayor;
    }
    public static int determinarMenor(int numero){
        int menor=9;

        for(int i=numero; i>0; i/=10){
            int ultimoNumero= i%10;

            if(ultimoNumero<menor){
                menor=ultimoNumero;
            }
        }
        return menor;
    }
}
