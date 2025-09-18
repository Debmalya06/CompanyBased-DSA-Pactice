import java.util.ArrayList;

public class Capgimini9 {
    public static void main(String[] args) {
        String s ="##Move##Hash#To#Front";
        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--){
            if (sb.charAt(i) == '#') {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb.toString());
    }
}
