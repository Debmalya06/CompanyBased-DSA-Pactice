public class Capgimini_4_26 {
    public static void main(String[] args) {
        String s = "mmgggmmmm";
        int n =9;
        int j=0,i=0,max=0,curr=0,start=0,end=0;
        while(j<n){
            if(s.charAt(j)=='m'){
                if(j!=0 && s.charAt(j-1)=='g'){
                    curr=0;
                    i=j;
                }
                curr++;

                if(curr > max){
                    max = curr;
                    start = i;
                    end = j;
                }
            }
            j++;
        }
        System.out.println(start+" "+ end);
    }
}
