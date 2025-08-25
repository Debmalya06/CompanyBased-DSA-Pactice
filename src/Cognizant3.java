import java.util.Scanner;

public class Cognizant3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 8-digit number (each 2 digits = ASCII): ");
        String input = sc.nextLine();  // Read as String

        if (input.length() != 8) {
            System.out.println("Invalid input! Please enter exactly 8 digits.");
            return;
        }

        for (int i = 0; i < input.length(); i += 2) {
            String chunkStr = input.substring(i, i + 2); // take 2 digits
            int chunk = Integer.parseInt(chunkStr);      // convert to int
            char ch = (char) chunk;                      // convert to ASCII
            System.out.println(chunk + " - " + ch);
        }
    }
}
