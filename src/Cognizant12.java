import java.util.*;

public class Cognizant12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String[] items = new String[n];
        int[] discounts = new int[n];
        int[] price = new int[n];
        int dparr = 0;
        int minDiscount = Integer.MAX_VALUE;

        // Read item details
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(",");
            items[i] = parts[0].trim();
            discounts[i] = Integer.parseInt(parts[2].trim());
            price[i] = Integer.parseInt(parts[1].trim());
            int dp = price[i]*discounts[i]/100;
            if (dp < minDiscount) {
                minDiscount = dp;
                dparr = discounts[i];
            }
        }

        // Print items with minimum discount
        for (int i = 0; i < n; i++) {
            if (discounts[i] == dparr) {
                System.out.println(items[i]);
            }
        }

        sc.close();
    }
}
