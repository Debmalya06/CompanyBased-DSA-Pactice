import java.util.Scanner;

public class deloitte4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 4,m=20, oddsum=0,evensum=0;
        for(int i=1;i<=m;i++){
            if(i%n==0) evensum+=i;
            else oddsum+=i;
        }
        System.out.println(oddsum + " "+evensum);
    }
}
