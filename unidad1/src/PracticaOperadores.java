public class PracticaOperadores {
    static void main() {

        boolean a= (20>40 && 2<=10)||(32<50 && 20<=20);
        System.out.println(a);

        boolean b= (10>5 && 7<20) || (15==15 && 8>=10);
        System.out.println(b);

        boolean c= (15-6*2>5 && (4+3)<2*5) || (8%3 == 2 && 10/2>=5);
        System.out.println(c);

        boolean d= (20/4== 5 && (3*2+2)<=11) || (12%5>2 && (10-5)*3>=15);
        System.out.println(d);

        boolean e= ((4*5+2)/3>5 && Math.pow(6,2)/3<15) || (25%4==3 && 10/3*2>=6);
        System.out.println(e);

        boolean f= (5 + 3 * 2 < 2 * 4 && 18 - 3 * 2 > 10) || (15 / 3 == 5 && 10 / 3 + 2 >= 5);
        System.out.println(f);

        boolean g= (10%4+6<= Math.pow((Math.pow(5,2)+Math.pow(9,2)),1/2)) && (8%6+12/4==Math.pow(2*3*4,3) || (Math.pow(6,2)+20/5>=5*10+Math.pow(2,3)));
        System.out.println(g);
    }
}
