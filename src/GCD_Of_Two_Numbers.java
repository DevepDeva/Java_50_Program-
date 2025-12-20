//Program to Find the greatest common divisor (GCD) of two numbers.

import java.util.Scanner;
public class GCD_Of_Two_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rem;
        while(n1%n2!=0){
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        System.out.println("GCD IS "+n2);
    }
}
