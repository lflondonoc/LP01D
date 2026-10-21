public class CompraProductos {
    static void main() {
        String mensaje= determinarCompra();
        Repositorio.mostrarMensaje(mensaje);


    }
    public static String determinarCompra(){
        String mensaje="";

        double totalCompra=0;
        int cantidadProductos=0;
        double mayor=0;

        for(int i=1; i<=5; i++){
            double precio= Repositorio.ingresarDecimal("Ingrese el precio "+i+": ");
            totalCompra= totalCompra+precio;

            if(precio >10000){
                cantidadProductos++;
            }
            if(precio>mayor){
                mayor=precio;
            }

        }
        mensaje+="El total de la compra es: "+(int)totalCompra+", la cantidad de productos mayores a $10.000 son: "+cantidadProductos+" y el producto más caro es: "+(int)mayor;
        return  mensaje;
    }
}
