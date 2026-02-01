//Q. Given a positive integer n, find the bitwise complement of n
//(i.e., flip all bits in its binary representation, up to the most significant bit).
//i/p: n = 10
//o/p:5
//Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which rep

import java.util.Scanner;

public class deloitte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;

        int result = n ^ mask;
        System.out.println(result);
    }
}

