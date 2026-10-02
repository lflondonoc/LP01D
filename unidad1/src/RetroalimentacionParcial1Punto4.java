public class RetroalimentacionParcial1Punto4 {
    static void main() {

    }

    public static double calcularConsumo (double distancia, double cantidadCombustible){
        double consumo= distancia/cantidadCombustible;
        return  consumo;
    }

    public static String determinarConsumo (double consumo){
        String mensaje="";
        if(consumo>=15){
            mensaje= "consumo eficiente";
        }else{
            mensaje= "consumo alto";
        }
        return mensaje;
    }
}
