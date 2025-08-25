class Solution {

    public static void main(String[] args) {
      int  nums1[]={1,3};
      int nums2[] = {2,4};




        int size = nums1.length + nums2.length;
        int []arr = new int[size];
        int i=0, j=0, k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k++]= nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }

        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }

        while (j < nums2.length) {
            arr[k++] = nums2[j++];

        }

        double median;
        if (size % 2 == 1) {
            median = arr[size / 2];
        } else {
            median = (arr[size / 2 - 1] + arr[size / 2]) / 2.0;
        }

//        return median;
        System.out.println(median);
    }
}