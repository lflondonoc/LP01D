public class Empresa {

    public static final double PORCENTAJE1= 0.10;
    public static final double PORCENTAJE2= 0.05;
    public static final double TOPE_SALARIO= 2500000;

    static void main() {
        double salario= Repositorio.ingresarDecimal("Ingrese su salario: ");
        double nuevoSalario= calcularAumento(salario);
        double bonificacion= calcularBonificacion(nuevoSalario);
        String mensaje= generarMensaje(nuevoSalario, bonificacion);
        Repositorio.mostrarMensaje(mensaje);
    }

    public static double calcularAumento (double salario){
        double nuevoSalario= salario + (salario*PORCENTAJE1);
        return nuevoSalario;
    }
    public static double calcularBonificacion (double nuevoSalario){
        double bonificacion;
        if (nuevoSalario > TOPE_SALARIO){
            bonificacion = nuevoSalario + (nuevoSalario*PORCENTAJE1);
        }else{
            bonificacion = nuevoSalario + (nuevoSalario*PORCENTAJE2);
        }
        return bonificacion;
    }
    public static String generarMensaje (double nuevoSalario, double bonificacion){
        String mensaje="Su salario con el aumento del "+(int)(PORCENTAJE1*100)+"% es "+nuevoSalario+" Y usted tiene una bonificación del ";
        if (nuevoSalario > TOPE_SALARIO) {
            mensaje += (int)(PORCENTAJE1*100)+"% por lo tanto su nuevo salario es de: "+bonificacion;
        }else{
            mensaje += (int)(PORCENTAJE2*100)+"% por lo tanto su nuevo salario es de: "+bonificacion;
        }
        return  mensaje;
    }

}
