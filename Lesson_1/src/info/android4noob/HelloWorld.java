package info.android4noob;

/**
 * вывод в консоль
 * конкатенация строк
 * коментарии
 */

public class HelloWorld {

    public static void main(String[] args) {

        // вывод в консоль Привет Мир!!! и переносит каретку на новую строку
        // println - выводит строки и делает перенос каретки на новую строку
        System.out.println("Привет Мир!!!");

        // вывод в консоль Привет Мир!!! с помощью конкатенации строк добавляет пробел
        // и переносит каретку на новую строку
        // println - выводит строки и делает перенос каретки на новую строку
        System.out.println("Привет" + " " + "Мир!!!");

        // вывод в консоль Привет Мир!!! с помощью конкатенации строк и переносит каретку на новую строку
        // println - выводит строки и делает перенос каретки на новую строку
        System.out.println("Привет" + "Мир!!!");

        // вывод в консоль Привет Мир!!! не переносит каретку на новую строку
        // продолжит следующий вывод в той же строке
        System.out.print("Привет Мир!!!");

        // вывод в консоль Привет Мир!!! с помощью конкатенации строк и переносит каретку на новую строку
        // "\n" - переносит каретку на новую строку
        System.out.print("Привет Мир!!!" + "\n");

        // Пример коментарий 1
        // System.out.println("Привет Мир!!!");


        /*
            Пример
            коментарий 2
            System.out.println("Привет Мир!!!");
        */

        /**
         * Используется для документирования кода
         * Пример
         * коментарий 3
         * System.out.println("Привет Мир!!!");
         */
    }

/*
   home work
   *********************************************************************************
   1) вывести в консоль Ваши фамилию имя и отчество с помощью метода println в столбик

   ПРИМЕР:
   Фамилия
   Имя
   Отчество

   *********************************************************************************
   2) вывести в консоль Ваши фамилию имя и отчество с помощью метода println в одну строчку

   a) с пробелами между слов
   b) без пробелов
   с) заменить пробелы на (*)

   ПРИМЕР:
   a) Фамилия Имя Отчество
   b) ФамилияИмяОтчество
   c) Фамилия*Имя*Отчество
   ***********************************************************************************
   3) вывести в консоль Ваши фамилию имя и отчество с помощью метода print в столбик
   использовать ("\n")

   ПРИМЕР:
   Фамилия
   Имя
   Отчество

   *********************************************************************************
   4) вывести в консоль Ваши фамилию имя и отчество с помощью метода print в одну строчку

   a) с пробелами между слов
   b) без пробелов
   с) заменить пробелы на (*)

   ПРИМЕР:
   a) Фамилия Имя Отчество
   b) ФамилияИмяОтчество
   c) Фамилия*Имя*Отчество
 */
}
