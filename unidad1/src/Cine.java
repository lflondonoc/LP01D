import javax.print.DocFlavor;

public class Cine {

    public static final double COSTO_ENTRADA= 20000;
    public static final double PORCENTAJE1= 0.20;
    public static final int EDAD=18;

    static void main() {
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        double descuento= calcularDescuento(edad);
        Repositorio.mostrarMensaje("El costo de la entrada es: "+descuento);

    }
    public static double calcularDescuento (int edad){
        double descuento=0;
        if(edad < EDAD){
            descuento= COSTO_ENTRADA - (COSTO_ENTRADA*PORCENTAJE1);
        }else{
            descuento= COSTO_ENTRADA;
        }
        return descuento;
    }
}
