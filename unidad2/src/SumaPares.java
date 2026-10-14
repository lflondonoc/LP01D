public class SumaPares {
    static void main() {
        int sumaPares= sumarPares();
        Repositorio.mostrarMensaje("La suma de los números pares del 1 al 10: "+sumaPares);

    }
    public static int sumarPares(){
        int sumaPares=0;

        for(int i=1; i<=10; i++){
            if(i%2==0){
                sumaPares+=i;
            }
        }
        return sumaPares;
    }
}
