public class deloitte3 {
    public static void main(String[] args) {
        int []arr ={12,3,14,56,77,13};
        int num =13;
        int diff=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int d= Math.abs(num-arr[i]);
            if(d<=diff) count++;
        }
        System.out.println(count);
    }
}
