import java.util.ArrayList;
import java.util.Scanner;

public class Cognizant7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st input:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Input:");
        int b= sc.nextInt();

        if (a <= 0 || b <= 0 || a >= b) {
            System.out.println("Provide valid input");
            return;
        }
        ArrayList<Integer> list= new ArrayList<>();
       for (int i=a;i<b;i++){
           if (isPrime(i)) {
             list.add(i);
           }
       }
        for(int j=0;j< list.size();j++){
            System.out.print(list.get(j)+" ");
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


}
