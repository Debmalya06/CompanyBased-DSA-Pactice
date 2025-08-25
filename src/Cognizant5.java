import java.util.Scanner;

public class Cognizant5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of tickets:");
        int n = sc.nextInt();

        System.out.println("Do you want refreshment (Y/N):");
        char c = sc.next().charAt(0);
        if (c != 'y' && c != 'Y' && c != 'n' && c != 'N') {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Do you have coupon code (Y/N):");
        char c2 = sc.next().charAt(0);
        if (c2 != 'y' && c2 != 'Y' && c2 != 'n' && c2 != 'N') {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter the circle (K/Q):");
        char circle = sc.next().charAt(0);
        if (circle != 'k' && circle != 'K' && circle != 'q' && circle != 'Q') {
            System.out.println("Invalid input");
            return;
        }

        int basePrice = (circle == 'k' || circle == 'K') ? 75 : 150;
        float total = n * basePrice;

        if (n > 20) {
            total -= (total * 0.10); // 10% discount
            if (c2 == 'y' || c2 == 'Y') {
                total -= (total * 0.02); // 2% coupon discount
            }
        }

        if (c == 'y' || c == 'Y') {
            total += n * 50; // Refreshment cost
        }

        System.out.println("Total ticket cost: " + total);
    }
}
