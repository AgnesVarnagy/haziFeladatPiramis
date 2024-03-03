import java.util.Scanner;

public class ElsoFeladat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a magasságot: ");
        int magsize = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Add meg a szélességet: ");
        int szelsize = scanner1.nextInt();

        System.out.println("Add meg a rajzoló szimbólumot: ");
        String symbol = scanner.next();

        for (int i = 0; i < magsize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        String symbol1 = scanner.next();

        for (int i = 0; i < magsize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol1 + " ");
        /*System.out.println("Add meg arajzoló szimbólumot: ");
        String symbol2 = scanner.next();
        for (int i = 0; i < szelsize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol2 + " ");
            }*/
            }
        }
    }
}

