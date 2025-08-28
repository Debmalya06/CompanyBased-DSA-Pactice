import java.util.Scanner;

public class Cognizant13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int semno = sc.nextInt();
        int[] semsub = new int[semno];

        for(int i=0;i<semno;i++){
            System.out.printf("Enter no of subjects in %d semester:\n",i+1);
            semsub[i]= sc.nextInt();
        }
        int maxnarr[]=new int[semno];

        for(int i=0;i<semno;i++){
            int maxno=0;
            System.out.printf("Marks obtain in semester %d:\n",i+1);
            int[] marks = new int[semsub[i]];
            for(int j=0;j<semsub[i];j++){
                marks[j] = sc.nextInt();
                if(marks[j]>100 || marks[j]<0) {
                    System.out.println("Invalid marks");
                    return;
                }
                 maxno= Math.max(marks[j],maxno);
            }
            maxnarr[i]=maxno;
        }
        for (int i=0;i<semno;i++){
            System.out.printf("Maximum mark in %d semester:%d\n",i+1,maxnarr[i]);

        }
    }
}
