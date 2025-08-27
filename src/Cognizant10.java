import java.util.Scanner;

public class Cognizant10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car no: ");
        int carNo = sc.nextInt();

        // Check for valid 4-digit positive number
        if (carNo < 1000 || carNo > 9999) {
            System.out.println("Not a valid car number");
            sc.close();
            return;
        }

        // Calculate sum of digits
        int sum = 0, temp = carNo;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check divisibility
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Not Lucky Number");
        }

        sc.close();
    }
}
