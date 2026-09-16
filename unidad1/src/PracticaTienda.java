public class PracticaTienda {

    //Constantes
    public static final double IVA=0.19;

    static void main() {
        String producto1= Repositorio.ingresarTexto("Ingrese el nombre del primer producto: ");
        double precio1= Repositorio.ingresarDecimal("Ingrese el precio del primer producto: ");
        String producto2= Repositorio.ingresarTexto("Ingrese el nombre del segundo producto: ");
        double precio2= Repositorio.ingresarDecimal("Ingrese el precio del segundo producto: ");
        double totalproducto1= calcularIvaProducto(precio1);
        double totalProducto2= calcularIvaProducto(precio2);
        double totalPagar= calcularTotalPagar(totalproducto1, totalProducto2);
        Repositorio.mostrarMensaje("El producto "+producto1+" tiene un valor de "+(int)precio1+" pesos, el producto "+producto2+" tiene un valor de "+(int)precio2+" pesos. Por tanto el valor de la compra de los dos productos con IVA es: "+(int)totalPagar+" pesos.");

    }
    //Función para calcular el iva de un producto
    public static double calcularIvaProducto (double precio){
        double productoIva= precio + (precio*IVA);
        return productoIva;
    }
    //Función para calcular el total a pagar
    public static double calcularTotalPagar (double totalProducto1, double totalProducto2){
        double total= totalProducto1+totalProducto2;
        return total;
    }


}
