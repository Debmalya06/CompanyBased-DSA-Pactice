import java.util.Scanner;

public class Cognizant6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int month = sc.nextInt();
       
        if(month<1 || month>12){
            System.out.println("Invaild Month!!");
            return;
        } else if (month>=3 && month<=5) {
            System.out.println("Spring");
        } else if (month>=5 && month<=8) {
            System.out.println("Summer");
        } else if (month>=9 && month<=11 ) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Winter");
        }

    }
}
