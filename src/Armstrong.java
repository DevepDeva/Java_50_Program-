//Program to Check if a number is an Armstrong number.

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n,arm=0,c,rem;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }if(c==arm)
            System.out.println("Number is Armstrong number ");
        else
            System.out.println("Not a Armstrong number ");

    }
}
