import java.util.Scanner;

public class sapLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        int count =0;
        while(j< s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                count++;
            }
            else{
                sb.append(s.charAt(i));
                sb.append(count);
                i=j;
                count=0;
            }
        }
        sb.append(s.charAt(i));
        sb.append(count);
        System.out.println(sb);

    }
}
