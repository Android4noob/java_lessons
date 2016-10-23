package info.android4noob;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            //0,1,2,3,4,5,6,7,8,9
        }
        System.out.print("\n");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            //0,1,2,3,4,5,6,7,8,9,10
        }

        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            //1,2,3,4,5,6,7,8,9,10
        }

        System.out.print("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
            //10,9,8,7,6,5,4,3,2,1
        }
        System.out.print("\n");
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
            //10,9,8,7,6,5,4,3,2,1
        }
        System.out.print("\n");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
            //10,9,8,7,6,5,4,3,2,1,0
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
            //0,2,4,6,8
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i += 3) {
            System.out.print(i);
            //0,3,6,9
        }
    }
}
