//Problem Description
//Given an array of integer nums and an integer k, return the total number of subarrays whose sum equals k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//
//        Input Format
//The first line contains an integer N, representing the length of the array.
//The second line contains N space-separated integers.
//The third line contains an integer k.
//        Output Format
//Print the total number of subarrays whose sum equals k.

//Sample Input:
//7
//        [0, 1, 2, 3, 4, 5, 6]
//        9
//Sample Output:
//        2

import java.util.Scanner;

public class TCSOA_1_2024 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i< n;i++){
        arr[i]= sc.nextInt();
        }
        System.out.println("enter k");
        int k = sc.nextInt();
        //logic
        int sum =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k) sum++;
            }
        }
        System.out.println(sum);

    }



}
