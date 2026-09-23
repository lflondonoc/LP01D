public class EmpresaFrutas {

    public static final int CAPACIDAD_CAJAS= 20;
    public static final int CANTIDAD_MAXIMA_CAJAS= 15;

    static void main() {
        int cantidadFruta= Repositorio.ingresarEntero("Ingrese la cantidad de fruta a despachar en kg: ");
        int cajas= calcularCantidadCajas(cantidadFruta);
        int restante= calcularRestanteCajas(cantidadFruta);
        String mensaje= determinarEnvio(cajas, restante);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static int calcularCantidadCajas (int cantidadFruta){
        int cajas= cantidadFruta/CAPACIDAD_CAJAS;
        return  cajas;
    }
    public static int calcularRestanteCajas (int cantidadFruta){
        int cajas= cantidadFruta % CAPACIDAD_CAJAS;
        return  cajas;
    }
    public static String determinarEnvio (int cantidadCajas, int restante){
        String mensaje="";
        if(cantidadCajas <= CANTIDAD_MAXIMA_CAJAS){
            mensaje = "su envío puede ser procesado y se necesitan "+cantidadCajas+ " cajas y queda esperando por completar "+restante+" kg de fruta para despachar";
        }else{
            mensaje = "Lo sentimos mucho, su envío no puede ser procesado por falta de cajas.";
        }
        return mensaje;
    }

}
