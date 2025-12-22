//Program for Calculate the length of a string without using len().


import java.util.Scanner;
public class Len_of_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String name=sc.nextLine();
        System.out.println(name.toCharArray().length);
        System.out.println(name.lastIndexOf(""));
        System.out.println(name.split("").length);
    }
}
