import java.util.Scanner;

public class OtodikFeladat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek adj meg egy számot! ");
        int number = scanner.nextInt();

        //System.out.println("Kérlek adj meg még egy számot! ");

        //for (int i = 0; i < size; i++) {
            if (number % 2 == 0) {
               System.out.println("Kérlek adj meg még egy számot! ");
            } else {
                System.out.println("Ez a szám páratlan! A játéknak vége!");

            }

        }
    }

