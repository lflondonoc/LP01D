public class RetroalimentacionParcialPunto3 {

    public static final double PRECIO1=35000, PRECIO2=50000, DESCUENTO=0.10;
    public static final int PESO=10;

    static void main() {
        double peso= Repositorio.ingresarDecimal("Ingrese el peso de su mascota: ");
        double valorFinal= calcularValorFinal(peso);
        Repositorio.mostrarMensaje("EL peso de su mascota es: "+peso+", por lo tanto el valor a pagar es: "+valorFinal);

    }
    public static double calcularValorFinal (double peso){
        double valorFinal=0;
        double total=0;
        if(peso <=PESO){
            valorFinal= peso*PRECIO1;
            total= valorFinal - (valorFinal*DESCUENTO);
        }else{
            valorFinal= peso*PRECIO2;
            total = valorFinal;
        }
        return total;
    }
}
