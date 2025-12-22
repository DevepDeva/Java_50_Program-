//Program to check Convert a decimal number to binary.

import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        long ans=0;
        long placevalue=1;
        while(num>0){
            int rem=num%2;
            ans=ans+rem*placevalue;
            num=num/2;
            placevalue*=10;
        }
        System.out.println("Binary value is : "+ans);
    }
}
