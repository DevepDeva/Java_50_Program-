//Program to reverse a String .

import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = sc.nextLine();
        String rev = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse a String " + rev);
    }
}
