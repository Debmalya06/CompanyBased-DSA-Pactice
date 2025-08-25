import java.util.Scanner;

public class Accenture_OA_1_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("find char");
        char c = sc.next().charAt(0);
        //logic
        int sum=0;
        if(!s.matches("[a-z]+")){
            System.out.println("String should be all lower case");
return;
        }
        for(int i=0;i<n;i++){

            if(s.charAt(i)==c ) sum++;
        }
        System.out.println(sum);

    }
}