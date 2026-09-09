public class OperadoresLogicos {
    static void main() {
        //Ejercicios con operadores lógicos AND(&&)
        boolean a= 3*2==2*3 && Math.pow(2,3)>Math.pow(1,2);
        System.out.println(a);

        boolean b= 1+4-8 != 2*4/8 && 3*7+1 >= 2*8;
        System.out.println(b);

        boolean tengoDinero=true;
        boolean estaLloviendo= false;
        boolean salgo= tengoDinero && estaLloviendo;
        System.out.println("¿Puedo salir?"+salgo);

        //Ejercicios de operadores lógicos con OR(||)
        boolean c= 3*2==2*3 || Math.pow(2,3)>Math.pow(1,2);
        System.out.println(c);

        boolean d= 3+2-4 != 2*2/4 || 3*4+8 >= 2*2*4;
        System.out.println(d);

        boolean haceSol= true;
        boolean esDomingo= false;
        boolean voyPlaya= haceSol || esDomingo;
        System.out.println("¿Voy a la playa?: "+voyPlaya);

    }
}
