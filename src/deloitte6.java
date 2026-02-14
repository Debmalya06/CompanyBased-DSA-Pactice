//palimdrome

import java.util.*;

public class deloitte6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        while(n!=0){
            int x=n%10;
             rev=rev*10+x;
            n=n/10;
        }
        if(rev==org) System.out.println("palimdrome");
        else System.out.println("not palimdrome");
        //add new
    }


}
