//Program to Find the sum of the first n odd numbers

import java.util.Scanner;
public class Sum_Of_OddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of term ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                sum=sum+i;
        }
        System.out.println("Sum of Odd number is :"+sum);
    }
}
