import java.util.Scanner;

public class OtodikFel {
    import java.util.Scanner;

    public class OtodikFeladat2 {
        public OtodikFeladat2() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean playAgain = true;
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Kérlek adj meg még egy számot! ");
                playAgain = true;
            } else {
                System.out.println("Ez a szám páratlan! A játéknak vége!");
                playAgain = false;
            }

        }
    }

}
