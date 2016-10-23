package info.android4noob;

public class DataType {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int result;

        //сложение
        result = a + b;
        System.out.println("сложение" + " " + result);

        //деление по модулю
        result = b / a;
        System.out.println("деление" + " " + result);

        // что бы получить 2.5 при деление 5 на 2
        // нужно одно из чисел привисти к типу с плавующей точкой (float)
        System.out.println("деление и преобразование типа" + " " + ((float) b) / a);

        //остаток от деления
        result = b % a;
        System.out.println("остаток от деления" + " " + result);

        //умножение
        result = a * b;
        System.out.println("умножение" + " " + result);

        //вычитание
        result = b - a;
        System.out.println("вычитание" + " " + result);

        //применение арифметических операций с присваиванием

        int w = 100;
        System.out.println("*******************");
        System.out.print("w += 10" + " ");
        System.out.println("тоже самое что и  " + "w = w + 10");
        System.out.print("результат" + " : ");
        System.out.println(w += 10);
        System.out.print("\n");
        // result 110

        int s = 100;
        System.out.print("s -= 10" + " ");
        System.out.println("тоже самое что и  " + "s = s - 10");
        System.out.print("результат" + " : ");
        System.out.println(s -= 10);
        System.out.print("\n");
        //result 90

        int z = 100;
        System.out.print("z *= 10" + " ");
        System.out.println("тоже самое что и  " + "z = z * 10");
        System.out.print("результат" + " : ");
        System.out.println(z *= 10);
        System.out.print("\n");
        //result 1000

        int c = 100;
        System.out.print("c /= 10" + " ");
        System.out.println("тоже самое что и  " + "c = c / 10");
        System.out.print("результат" + " : ");
        System.out.println(c /= 10);
        System.out.print("\n");
        //result 10

        int v = 100;
        System.out.print("v %= 10" + " ");
        System.out.println("тоже самое что и  " + "v = v % 10");
        System.out.print("результат" + " : ");
        System.out.println(v %= 10);
        System.out.print("\n");
        //result 0
    }
}
/* home work

    задание 1
    int a = 10;
    int b = 15;
    int result;
    вывести в консоль 15 / 10 = 1.5
    вывести в консоль остаток от деления 15 / 10 = 1

    задание 2
    вывести в консоль таблицу умножения
 */
