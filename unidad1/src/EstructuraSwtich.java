public class EstructuraSwtich {
    static void main(String[] args) {

        int dia= Repositorio.ingresarEntero("Ingrese un número: ");
        String mensaje= determinarDia(dia);
        Repositorio.mostrarMensaje(mensaje);

        //Semáforo
        String color= Repositorio.ingresarTexto("Ingrese un color: ");
        String semaforo= determinarSemaforo(color);
        Repositorio.mostrarMensaje(semaforo);

    }
    public static String determinarDia(int dia){
        String mensaje="";
        switch (dia){
            case 1:
                mensaje = "Lunes.";
                break;
            case 2:
                mensaje = "Martes.";
                break;
            case 3:
                mensaje = "Miércoles.";
                break;
            case 4:
                mensaje = "Jueves.";
                break;
            case 5:
                mensaje = "Viernes.";
                break;
            case 6:
                mensaje = "Sábado.";
                break;
            case 7:
                mensaje = "Domingo";
                break;
            default:
                mensaje = "Fuera del rango.";
        }
        return  mensaje;
    }
    public static String determinarSemaforo (String color){
        String mensaje="";
        switch (color){
            case "rojo":
                mensaje = "Deténgase.";
                break;
            case "amarillo":
                mensaje = "Prepárese.";
                break;
            case "verde":
                mensaje = "Siga.";
                break;
            default:
                mensaje = "Se dañooooo.";
        }
        return mensaje;
    }
}
