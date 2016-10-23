package info.android4noob;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.print("a == b" + " " + "=" + " ");
        System.out.println(a == b);
        //false

        System.out.print("a != b" + " " + "=" + " ");
        System.out.println(a != b);
        //true

        System.out.print("a <= b" + " " + "=" + " ");
        System.out.println(a <= b);
        //true

        System.out.print("a >= b" + " " + "=" + " ");
        System.out.println(a >= b);
        //false

        System.out.print("a < b" + " " + "=" + " ");
        System.out.println(a < b);
        //true

        System.out.print("a > b" + " " + "=" + " ");
        System.out.println(a > b);
        //false

        System.out.print("b < a && a < b" + " " + "=" + " ");
        System.out.println(b < a && a < b);
        //false

        System.out.print("b < a || a < b" + " " + "=" + " ");
        System.out.println(b < a || a < b);
        //true

        System.out.println(!false);
        //true
    }
}
