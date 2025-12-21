//Program for Print the first n prime numbers

import java.util.Scanner;
public class Print_n_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter two  number : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int i,j;
        for(i=n1;i<=n2;i++){
            for(j=2;j<=i;j++){
                if(i%j==0)
                    break;
            }if(i==j)
                System.out.print(j+" ");
        }

    }
}
