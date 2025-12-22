//Find the sum of the squares of the first n natural numbers

import java.util.Scanner;
public class Sum_Of_N2_NaturalNumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a term");
        int n=sc.nextInt();
        System.out.println("The sum of the Squares of the First "+n+"Natural number is : ");
        for(int i=1;i<=n;i++){

            System.out.print((i*i)+" ");
        }

    }
}
