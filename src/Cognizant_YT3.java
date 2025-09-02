import java.util.ArrayList;
import java.util.Arrays;

public class Cognizant_YT3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,10,20,30};
        int FirsthalfEnd = arr.length/2;
        int FSum=0;
        int LSum = 0;
        for(int i=0;i<FirsthalfEnd;i++){
            FSum+=arr[i];
        }
        for(int i=FirsthalfEnd;i<arr.length;i++){
            LSum+=arr[i];
        }
        int newarr[]= new int[6];
        if(FSum<LSum){
            for (int i= 0; i<arr.length; i++){
              newarr[i]=arr[arr.length-1-i];
            }
            System.out.println(Arrays.toString(newarr));
            }
        else{
            System.out.println(Arrays.toString(arr));
        }

    }

}
