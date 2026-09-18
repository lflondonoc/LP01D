public class Decisiones {
    static void main() {
        //Persona es mayor de edad
        //1. Ingresara su edad
        int edad= Repositorio.ingresarEntero("Ingrese su edad: ");
        //2. Si la persona es mayor de edad
        String mensaje= determinarIngreso(edad);
        //3. Mostrar por mensaje si es mayor de edad
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String determinarIngreso(int edad){
        String mensaje= "La edad es "+edad+ " años. Por lo tanto: ";
        if(edad >=18){
            mensaje += "Puede ver la película";
        }else{
            mensaje +="No puede ingresar";
        }
        return mensaje;
    }

}
