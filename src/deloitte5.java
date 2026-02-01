public class deloitte5 {
    public static void main(String[] args) {
        int [] arr= {2,1,0,2,1,0,0,1,2,0};
        int n=10;
        int newarr[] = new int[n];
        int zero=0, one =0, two=0;
        for(int num:arr){
            if(num==0) zero++;
            else if(num==1) one++;
            else if(num==2) two++;
        }
        for(int i=zero;i<(one+zero);i++){
            newarr[i]=1;
        }
        for(int i=one+zero;i<n;i++){
            newarr[i]=2;
        }
        for(int nums:newarr){
            System.out.print(nums+" ");
        }
    }
}
