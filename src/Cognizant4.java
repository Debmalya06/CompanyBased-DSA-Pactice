import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Cognizant4 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        if(cse<0) {
            System.out.println("Input is invaild");
            System.exit(0);
        }

        System.out.println("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        if(ece<0) {
            System.out.println("Input is invaild");
            System.exit(0);
        }

        System.out.println("Enter the no of students placed in MECH");
        int mech = sc.nextInt();
        if(mech<0){
            System.out.println("Input is invaild");
            System.exit(0);
        }

        if(cse==ece && ece==mech){
            System.out.println("None of the department has got the highest placement");
            System.exit(0);
        }
        if(cse>ece){
            if(cse>mech) System.out.println("Highest placement CSE");
            else{
                System.out.println("Highest placement MECH");
            }
        }
        else if(ece>mech){
            System.out.println("Highest placement ECE");
        }
        else{
            System.out.println("Highest placement MECH");
        }


    }
}
