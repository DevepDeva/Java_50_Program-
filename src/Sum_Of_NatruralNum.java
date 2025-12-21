// Calculate the sum of the first n natural numbers

import java.util.Scanner;
public class Sum_Of_NatruralNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of term ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of natural number is : "+sum);

    }
}
