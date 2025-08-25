import java.util.Scanner;

public class Cognizant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println(n+" is an Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        int d = sc.nextInt();
        if(d<=0){
            System.out.println(d+" is an Invalid Input");
            System.exit(0);
        }
        float ans = n/d*100;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f", ans);
        System.out.println();
        double m = d*0.6214;
        double ga= n* 0.2642;
        double ans2 = m/ga;
        System.out.println("Miles/gallons");
        System.out.printf("%.2f",ans2);
        String s= "fff";

    }
}
