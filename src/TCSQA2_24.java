//    You are tasked with writing a program to calculate the total shipping cost based on the weight of the package and the distance it needs to travel. The following criteria determine the shipping cost:
//
//            1. Base money: $5.00 (must be included in the shipping cost)
//
//            2. Cost per kilogram: $2.00
//
//            3. Cost per 10 kilometers: $0.5
//
//    Input Format
//    The first line contains an integer w, representing the weight of the package.
//    The second line contains an integer d, representing the distance it needs to travel.
//            Output Format
//    Print the total shipping cost of the package.


import java.util.Scanner;

public class TCSQA2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int d = sc.nextInt();
        int b =5;
        int cw = 2;
        double cd = 0.5;
        double ans = b+(w*cw)+((d*cd)/10);
        System.out.println(ans);

    }

}
