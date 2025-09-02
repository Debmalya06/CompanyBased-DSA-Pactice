import java.util.Scanner;

public class Cognizant_YT2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "JAMES";
        int sum=0;
       for(int i=0;i<s.length();i++){
           char c =s.charAt(i);
           int ascii = (int)c;
           int product = ascii*(i+1);
           if(((i+1)%2)!=0 || ascii%2!=0){
               sum=sum+product;
           }

       }
        System.out.println(sum);

    }
}
