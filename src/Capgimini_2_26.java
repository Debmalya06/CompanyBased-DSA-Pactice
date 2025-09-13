import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Capgimini_2_26 {
    public static void main(String[] args) {
        int arr[]= {5,3,1,8,4,2};
        Arrays.sort(arr);
        int sum=0;
        for (int i = 0; i < arr.length - 1; i += 2) {
         sum +=arr[i];
        }

        System.out.println(sum);
    }
}
