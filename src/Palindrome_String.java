//Program to check if a String is Palidrome.

import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("String is Not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("String is a Palindrome");
    }
}
