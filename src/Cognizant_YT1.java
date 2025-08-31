import java.util.Arrays;
import java.util.Scanner;

public class Cognizant_YT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int operation=0;
        int arr[] = new int[n];
        int freq[] = new int[n+1];
        for(int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
            if(arr[i]>1 && arr[i]<n){
                freq[arr[i]]++;
            }
        }
        //arr={1,1,3,3,4}
        //freq={0,2,0,2,1,0}
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(freq[i]==0){
                operation++;
            }
        }
        System.out.println(operation);
    }
}
