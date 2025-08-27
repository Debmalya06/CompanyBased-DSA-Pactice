import java.util.*;

public class Cognizant9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal= sc.nextInt();
        if(sal<=0) {
            System.out.println("Invalid Input");
            return;
        }
        float rat= sc.nextFloat();
        if(rat<=0 || rat>5) {
            System.out.println("Invalid Input");
            return;
        }
        double increase;
        if(rat>=1 && rat<=3 ){
            increase=( 0.1*sal);
        }
        else if(rat>3 && rat<=4) increase=(0.25*sal);
        else increase=0.3*sal;

        System.out.println((int)(sal+increase));
    }
}
