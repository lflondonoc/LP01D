public class PrimerUltimo {
    static void main() {
        int []numeros={234,123,567,891};
        String diferencia= calcularDiferencia(numeros);
        Repositorio.mostrarMensaje(diferencia);

    }
    public static String calcularDiferencia(int []numeros){
        String mensaje="";
        int diferencia=0;
        for(int i=0; i<numeros.length; i++){
            int numero= numeros[i];
            int ultimoNumero=0;
            int primerNumero=0;
            for(int j=numero; j>0; j/=10){
                if(j==numero){
                    ultimoNumero= j%10;
                }
                primerNumero= j;
            }
            diferencia= primerNumero-ultimoNumero;
            mensaje+= "La diferencia entre el primer y el último es: "+diferencia+"\n";
        }
        return mensaje;
    }
}
