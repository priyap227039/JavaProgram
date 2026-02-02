//calculate percentage of the marks of a student


import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subject=5;
        System.out.println("enter marks per subject(80 or 100)");
        int perSubjectMarks=sc.nextInt();
        System.out.println("enter makrs of maths");
        float m1=sc.nextFloat();
        System.out.println("enter makrs of science");
        float m2=sc.nextFloat();
        System.out.println("enter makrs of sst");
        float m3=sc.nextFloat();
        System.out.println("enter makrs of english");
        float m4=sc.nextFloat();
        System.out.println("enter makrs of hindi");
        float m5=sc.nextFloat();
        double sum=m1+m2+m3+m4+m5;
        int totalmarks=perSubjectMarks*subject;
       
       double percentage=(sum/totalmarks)*100;
       sc.close();
       System.out.println("the perecentage of a student is "+percentage+"%");
    }
}
