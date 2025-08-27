import java.util.Scanner;

public class Cognizant11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of course:");
        int course =sc.nextInt();
        if(course<1 || course>20) {
            System.out.println("Enter the valid range");
            return;
        }
        sc.nextLine();
        System.out.println("Enter course names:");
        String[] couName = new String[course];
        for(int i=0;i<couName.length;i++){
            couName[i]=sc.nextLine();
        }
        System.out.println("Enter the course to be searched:");
        String search = sc.nextLine();
        for(int i=0;i<course;i++){
            if(couName[i].equals(search)){
                System.out.println(search+" course is available");
                return;
            }
        }
        System.out.println("Not available!!");



    }
}
