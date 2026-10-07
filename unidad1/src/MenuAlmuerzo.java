public class MenuAlmuerzo {
    static void main() {
        String proteina= Repositorio.ingresarTexto("Seleccion una de las siguientes proteinas (pollo, carne o pescado): ");
        String menu= determinarMenu(proteina);
        Repositorio.mostrarMensaje(menu);

    }
    public static String determinarMenu(String proteina){
        String menu="Puede preparar ";
        if(proteina.equals("pollo")){
            String verduras= Repositorio.ingresarTexto("¿Tiene verduras (si/no)?: ");
            if(verduras.equals("si")){
                String arroz= Repositorio.ingresarTexto("¿Tiene arroz (si/no)?: ");
                if (arroz.equals("si")){
                    menu += "pollo con arroz y verduras.";
                }else{
                    menu += "pollo con verduras";
                }
            }else{
                menu += "pollo a la plancha";
            }
        }else if(proteina.equals("carne")){
            String tortillas= Repositorio.ingresarTexto("¿Tiene tortillas (si/no)?: ");
            if(tortillas.equals("si")){
                menu += "tacos de carne";
            }else{
                menu += "carne con ensalada";
            }
        }else if(proteina.equals("pescado")){
            String limon= Repositorio.ingresarTexto("¿Tiene limón (si/no)?: ");
            if(limon.equals("si")){
                menu += "pescado al limón";
            }else{
                menu += "pescado a la plancha";
            }
        }else{
            menu = "Opción no válida";
        }
        return menu;
    }
}
