//program to print prime or not

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter n natural number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div=2;
        while(div<n){
            if(n%div==0){
                System.out.println("Not prime");
            }else
            {
                div++;

            }
        }
        System.out.println("Is Prime");
    }
}
