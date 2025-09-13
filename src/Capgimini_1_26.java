public class Capgimini_1_26 {
    public static int findans(int arr[]){
        int size = arr.length;
        if(size<=1) return 0;
        int j=1, len =1, Plen=0;
        while(j<size){
            if(arr[j-1]>arr[j]){
                len++;
                j++;
            }
            else{
                Plen= Math.max(len,Plen);
                len=1;
                j++;
            }
        }
        Plen= Math.max(len,Plen);
        if(Plen>1) return Plen;
        else{
           return 0;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println(findans(arr));

    }

}
