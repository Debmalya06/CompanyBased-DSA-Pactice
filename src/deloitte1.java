//Given an array of integers, move all the zeros to the end of the array while maintaining the relative order of
// the non-zero elements.
//I/P: n = 7 arr = [1, 0, 3, 0, 5, 0, 7]
//o/p: 1 3 5 7 0 0 0
import java.util.Scanner;

public class deloitte1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findans(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void findans(int[] arr, int n){
        int count =0;
//        int freq[]= new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            if(arr[i]==0) count++;
        }
        if(count>0){
            for(int i=n-count;i<n;i++){
                arr[i]=0;
            }
        }
    }

}
