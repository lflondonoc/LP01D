public class LigaBoxeo {

    public static final int MINIMO=47, MOSCA=52, GALLO=55, PLUMA=64, MEDIANO= 77, CRUCERO=90;

    static void main() {
        double peso= Repositorio.ingresarDecimal("Ingrese su peso: ");
        String categoria= determinarCategoria(peso);
        Repositorio.mostrarMensaje(categoria);

    }
    public static String determinarCategoria(double peso){
        String categoria= "Su peso es: "+peso+". Por lo tanto, se encuentra en la categoría: ";
        if(peso <=MINIMO){
            categoria += "MINIMO";
        }else if(peso<=MOSCA){
            categoria += "MOSCA";
        }else if(peso<=GALLO){
            categoria += "GALLO";
        }else if(peso<=PLUMA){
            categoria += "PLUMA";
        }else if(peso<=MEDIANO){
            categoria += "MEDIANO";
        } else if (peso<=CRUCERO) {
            categoria += "CRUCERO";
        }else{
            categoria += "PESADO";
        }
        return categoria;
    }
}
