public class PracticaNotas {
    static void main() {
        //Invocación de funciones
        double nota1= Repositorio.ingresarDecimal("Ingrese la nota 1: ");
        double nota2= Repositorio.ingresarDecimal("Ingrese la nota 2: ");
        double nota3= Repositorio.ingresarDecimal("Ingrese la nota 3: ");
        double nota4= Repositorio.ingresarDecimal("Ingrese la nota 4: ");
        double nota5= Repositorio.ingresarDecimal("Ingrese la nota 5: ");
        double definitiva= calcularNotaDefinitiva(nota1, nota2, nota3, nota4, nota5);
        Repositorio.mostrarMensaje("La nota definitiva es: "+definitiva);

    }
    //Función para calcular nota definitiva
    public static double calcularNotaDefinitiva (double nota1, double nota2, double nota3, double nota4, double nota5){
        double notaDefinitiva= (nota1+nota2+nota3+nota4+nota5)/5;
        return  notaDefinitiva;
    }

}
