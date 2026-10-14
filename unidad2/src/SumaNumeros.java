public class SumaNumeros {
    static void main() {
    int sumaNumeros= sumarNumeros();
    Repositorio.mostrarMensaje("La suma de lo números del 1 al 10: "+sumaNumeros);
    }
    public static int sumarNumeros(){
        int sumaNumeros=0;

        for(int i =1; i<=10; i++){
            sumaNumeros+=i;
        }
        return sumaNumeros;
    }
}
