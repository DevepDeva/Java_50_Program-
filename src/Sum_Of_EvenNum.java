//Program to Find the sum of the first n even numbers

import java.util.Scanner;
public class Sum_Of_EvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the terms ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of Even number is : "+sum);

    }
}
