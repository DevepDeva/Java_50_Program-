//Program Input two numbers and print their sum.

import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 1st number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of number is "+c);
    }
}
