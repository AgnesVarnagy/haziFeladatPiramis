import java.util.Scanner;

public class MasodikFeladat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek add meg az első számot (-100 és 100 között): ");
        int num1 = scanner.nextInt();

        System.out.println("Kérlek add meg az második számot (-100 és 100 között): ");
        int num2 = scanner.nextInt();

        System.out.println("A két szám közötti páros számok ezek: ");
        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }
    }
}
