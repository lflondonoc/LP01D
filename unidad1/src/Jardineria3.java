import javax.swing.*;

public class Jardineria3 {

    static void main() {


        //1.Ingresar la longitud
        int longitud= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud: "));

        //2.Ingresar el ancho
        int ancho= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ancho: "));

        //3.Calcular el superficie
        int superficie= longitud*ancho;

        //4.Generar mensaje
        String mensaje= "El valor de la longitud es: "+longitud+", el valor del ancho es: "+ancho+". Por lo tanto, el valor de la superficier es: "+superficie;

        //5.Mostrar mensaje
        JOptionPane.showMessageDialog(null, mensaje);



    }
}
