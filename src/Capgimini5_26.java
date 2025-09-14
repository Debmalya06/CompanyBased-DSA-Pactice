public class Capgimini5_26 {
    public static void main(String[] args) {
        String s= "aaacccccbbd";
        int count=1,max=1; char c=' ';
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                count=1;
            }
            else {
                count++;
                if(max<count){
                    max=count;
                    c= s.charAt(i);
                }
            }
        }
        System.out.print(c);
        System.out.println(max);
    }
}
