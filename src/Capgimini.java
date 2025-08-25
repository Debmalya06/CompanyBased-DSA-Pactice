import java.util.Scanner;

public class Capgimini {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int len= a.length();
        moveHash(a, len);
    }
    public static void moveHash(String str ,int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='#'){
            sb2.append('#');
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println( sb2.toString()+sb.toString());
    }

}
