import java.util.Scanner;

public class Cognizant_YT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int count=0;
        int arr[] = {1,2,1,3,5,2,4};
        for(int i=0;i<= arr.length-3;i++){
            int f = arr[i];
            int s= arr[i+1];
            int t= arr[i+2];

            if(f+t==s) count++;
        }
        System.out.println(count);

    }
}
