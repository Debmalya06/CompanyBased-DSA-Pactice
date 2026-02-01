//Input n 4
//m:20
//Output 90
//Explanation
//Sum of numbers divisible by 4 are 4+ 8+ 12+ 16 20=60
//Sum of numbers not divisible by 4 are 1+2+ 3+5+ 6+ 7+9+10+ 11+13+ 14 +15+17+18+ 19 = 150
// Difference 150-60 =90
import java.util.Scanner;

public class deloitte4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 4,m=20, oddsum=0,evensum=0;
        for(int i=1;i<=m;i++){
            if(i%n==0) evensum+=i;
            else oddsum+=i;
        }

        System.out.println(oddsum - evensum);
    }
}
