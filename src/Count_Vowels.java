//Program to Count the number of vowels in a string.

import java.util.Scanner;
public class Count_Vowels {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len,counter=0;
        char ch;
        len=str.length();
        for(int i=0;i<=len-1;i++){
            ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||
                    ch=='I'||ch=='O'||ch=='U'){
                counter++;
            }
        }
        System.out.println("Vowels are "+counter);
    }
}
