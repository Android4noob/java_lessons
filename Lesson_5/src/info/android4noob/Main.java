package info.android4noob;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        byte b = 10;
        short s = 10;
        float f = 10f;
        long l = 10L;
        double d = 10d;
        char c = 'c';
        String string = "100";


        System.out.println("Преобразование byte в int" + " " + (i = b));
        System.out.println("Преобразование int в byte" + " " + (b = (byte) i));

        System.out.println("Преобразование short в int" + " " + (i = s));
        System.out.println("Преобразование int в short" + " " + (s = (short) i));

        System.out.println("Преобразование int в float" + " " + (f = i));
        System.out.println("Преобразование float в int" + " " + (i = (int) f));

        System.out.println("Преобразование int в double" + " " + (d = i));
        System.out.println("Преобразование double в int" + " " + (i = (int) d));

        System.out.println("Преобразование int в long" + " " + (l = i));
        System.out.println("Преобразование long в int" + " " + (i = (int) l));

        System.out.print("\n");
        System.out.println("Преобразование int в String" + " " + String.valueOf(i));
        System.out.println("Преобразование byte в String" + " " + String.valueOf(b));
        System.out.println("Преобразование short в String" + " " + String.valueOf(s));
        System.out.println("Преобразование long в String" + " " + String.valueOf(l));
        System.out.println("Преобразование float в String" + " " + String.valueOf(f));
        System.out.println("Преобразование double в String" + " " + String.valueOf(d));
        System.out.println("Преобразование char в String" + " " + String.valueOf(c));

        System.out.print("\n");
        System.out.println("Преобразование String в int" + " " + Integer.parseInt(string));
        System.out.println("Преобразование String в byte" + " " + Byte.parseByte(string));
        System.out.println("Преобразование String в short" + " " + Short.parseShort(string));
        System.out.println("Преобразование String в float" + " " + Float.parseFloat(string));
        System.out.println("Преобразование String в double" + " " + Double.parseDouble(string));
        System.out.println("Преобразование String в long" + " " + Long.parseLong(string));
     }
}
