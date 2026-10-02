public class RetroalimentacionPunto1 {

    public static final int CONSUMO=100;

    static void main() {
        double litros= Repositorio.ingresarDecimal("Ingrese la cantidad de litros consumidos: ");
        int personas= Repositorio.ingresarEntero("Ingrese la cantidad de personas: ");
        double promedioConsumo= calcularConsumo(litros, personas);
        String mensaje= determinarClasificacion(promedioConsumo);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static double calcularConsumo (double litros, int personas){
        double promedioConsumo= litros/personas;
        return promedioConsumo;
    }
    public static String determinarClasificacion (double promedio){
        String mensaje= "";
        if(promedio<= CONSUMO){
            mensaje = "Consumo adecuado";
        }else{
            mensaje = "Consumo elevado";
        }
        return  mensaje;
    }
}
