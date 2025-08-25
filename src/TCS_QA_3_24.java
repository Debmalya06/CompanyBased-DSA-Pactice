//TCS OA-3 2024
//        Problem Description
//        Given an integer array nums, the task is to find the contiguous subarray (containing at least one number) that has the largest sum and return that sum.
//
//        Input Format
//        The first line contains an integer N, representing the length of the array.
//        The second line contains N space-separated integers.
//        Output Format
//        Print the sum of the subarray with the maximum sum.
//
//        Constraints
//        1 ≤ N ≤ 10⁴
//        -10³ ≤ nums[i] ≤ 10³
//        Example
//        Sample Input:
//        9
//        [-3,2,-4,5,-2,3,2,-6,5]
//        Sample Output:
//        8
//        Explanation:
//        The subarray [5,-2,3,2] has the largest sum 8.





import java.util.Scanner;

public class TCS_QA_3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int ans= Integer.MIN_VALUE, curr=0;
        for(int i=0;i< arr.length;i++){
            curr = curr + arr[i];
            ans = Math.max(curr,ans);
            if(curr<0) curr = 0;
            boolean c;

        }
        System.out.println(ans);
    }

}
