//Program to Calculate the compound interest

import java.util.Scanner;
public class Compound_Interset {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of principal: ");
        double principal=sc.nextDouble();
        System.out.println("Enter value of Rate: ");
        double rate=sc.nextDouble();
        System.out.println("Enter value of Time : ");
        double time=sc.nextDouble();
        double ci=principal*Math.pow((1+rate/100),time)-principal;
        System.out.println("Compound Interset is : "+ci);

    }
}
