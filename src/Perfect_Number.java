//Check if a number is a perfect number

import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum=sum+i;
        }if(num==sum)
            System.out.println("Number is a Perfect Number");
        else
            System.out.println("Number is not a Perfect Number");
    }
}
