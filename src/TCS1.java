//
//TCS PYQ: String Balance Problem
//        Q1. Problem Statement
//        Given a string S (input consisting) of '*' and '#'. The length of the string is variable. The task is to find the minimum number of '*' or '#' to make it a valid string. The string is considered valid if the number of '*' and '#' are equal. The '*' and '#' can be at any position in the string.
//        Note: The output will be a positive or negative integer based on the number of '*' and '#' in the input string.
//        (* > #): positive integer
//        (# > *): negative integer
//        (# = *): 0
//        Example 1:
//        Input 1: ###***
//        Output: 0 (number of * and # are equal)
//        Example 2:
//        Input 2: ****###
//        Output: 1
//        Example 3:
//        Input 3: ###**
//        Output: -1
import java.util.Scanner;

public class TCS1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int hash=0, star=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='#') hash++;
            else star++;
        }
        System.out.println(star-hash);

    }
}
