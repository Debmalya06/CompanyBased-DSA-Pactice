import java.util.*;

public class TCS_QA_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sring: ");
        String s = sc.nextLine();
        String[] srr = s.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(srr));
        String result = String.join(" ", uniqueWords);
        System.out.println(result.trim());


            }

}
