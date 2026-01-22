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
