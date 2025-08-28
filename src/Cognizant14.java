import java.util.Scanner;

public class Cognizant14 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    n = Math.abs(n);
    if (n == 0) {
        System.out.println("No Factors");
        sc.close();
        return;
    }
    boolean first = true;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(i);
            first = false;
        }

    }
}
}
