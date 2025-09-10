public class Capgimini1 {
    public static void main(String[] args) {
        String str= "aabbbccdddd";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char c = str.charAt(i);
            int count =1;
        while(i+1<str.length() && str.charAt(i+1)==c){
            count++;
            i++;
        }
        sb.append(c).append(count);
    i++;
        }
        System.out.println(sb.toString());
    }
}
