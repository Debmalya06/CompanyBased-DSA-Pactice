import java.util.Scanner;

public class Cognizant2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought: ");
        int p = sc.nextInt();
        System.out.print("Enter the no of puffs bought: ");
        int puf = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought: ");
        int c = sc.nextInt();
        System.out.println();
        int total = (p*100)+(puf*20)+(c*10);
        System.out.println("No of pizzas:"+p);
        System.out.println("No of puffs:"+puf);
        System.out.println("No of cooldrinks:"+c);
        System.out.println("Total price="+total);

    }
}
