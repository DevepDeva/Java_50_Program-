//program for Find the sum of digits of a number

import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits of  numbers "+sum);
    }
}
