import java.lang.reflect.Array;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        String s = "dfdg";
        String[] str = {s};
        int f= 0;
        int l= str.length-1;
        while(f<l){
            String temp = str[l];
            str[l]=str[f];
            str[f]= temp;
        }
//        return str.toString();

    }

}
