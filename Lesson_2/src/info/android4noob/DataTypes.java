package info.android4noob;

public class DataTypes {

    public static void main(String[] args) {

        // Объём занимаемой памяти 8 байт
        // Диапазон [-128, 127]
        // Инициализация переменной b типа byte
        byte b = 25;

        // Объём занимаемой памяти 16 байт
        // Диапазон [-32768, 32767]
        // Инициализация переменной s типа short
        short s = 3737;

        // Объём занимаемой памяти 32 байт
        // Диапазон [-2147483648, 2147483647]
        // Инициализация переменной i типа int
        int i = 0;

        // Объём занимаемой памяти 64 байт
        // Диапазон [-9223372036854775808, 9223372036854775807]
        // Инициализация переменной l типа long
        long l = 0;

        // Объём занимаемой памяти 32 байт
        // Диапазон [1.4e^-45, 3.4028235e^38]
        // Инициализация переменной f типа float
        float f = 0.125f;

        // Объём занимаемой памяти 64 байт
        // Диапазон [4.9e^-324, 1.7976931348623157^308]
        // Инициализация переменной d типа double
        double d = 0.125;

        // Объём занимаемой памяти 16 байт
        // Диапазон ['\u0000', '\uffff'] или [0, 65535]
        // Инициализация переменной a типа char
        char a = 'a';//standard form

        // Другие примеры
        char z = '\001';//octal form
        char x = '\u0001';//hexadecimal form

        boolean yes = true; // true
        boolean no = false; // false

        System.out.println("byte " + "[" + Byte.MIN_VALUE + "]" + "[" + Byte.MAX_VALUE + "]");
        System.out.println("short " + "[" + Short.MIN_VALUE + "]" + "[" + Short.MAX_VALUE + "]");
        System.out.println("int " + "[" + Integer.MIN_VALUE + "]" + "[" + Integer.MAX_VALUE + "]");
        System.out.println("long " + "[" + Long.MIN_VALUE + "]" + "[" + Long.MAX_VALUE + "]");
        System.out.println("float " + "[" + Float.MIN_VALUE + "]" + "[" + Float.MAX_VALUE + "]");
        System.out.println("double " + "[" + Double.MIN_VALUE + "]" + "[" + Double.MAX_VALUE + "]");
        System.out.println("char " + "[" + (Character.MIN_VALUE + 0) + "]" + "[" + (Character.MAX_VALUE + 0) + "]");
        System.out.println("boolean " + String.valueOf(yes) + " or " + String.valueOf(no));

    }
}
