import java.util.Scanner;

public class Cognizant8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("Invalid Input");
            return;
        }
        int temp= n;
        int rev=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev= rev*10+rem;
            temp=temp/10;
        }
        if(rev==n) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
