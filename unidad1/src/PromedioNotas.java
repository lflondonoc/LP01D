public class PromedioNotas {

    public static final double NOTA_MAXIMA=4.5, NOTA_MINIMA=3.0;

    static void main() {
        double nota1= Repositorio.ingresarDecimal("Ingrese la nota 1: ");
        double nota2= Repositorio.ingresarDecimal("Ingrese la nota 2: ");
        double nota3= Repositorio.ingresarDecimal("Ingrese la nota 3: ");
        double promedio= calcularPromedio(nota1, nota2, nota3);
        String mensaje= determinarDesempenio(promedio);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static double calcularPromedio (double nota1, double nota2, double nota3){
        double promedio= (nota1+nota2+nota3)/3;
        return  promedio;
    }

    public static String determinarDesempenio (double promedio){
        String mensaje="El promedio de notas es: "+Math.round(promedio*10)/10.0+".Por lo tanto, su desempeño es: ";

        if(promedio>= NOTA_MAXIMA){
            mensaje += "Excelente";
        }else if(promedio>=NOTA_MINIMA){
            mensaje += "Satisfacotiro";
        }else{
            mensaje+= "Insuficiente";
        }
        return  mensaje;
    }
}
