//Program Count the number of words in a string.

import java.util.Scanner;
public class Count_Num_Of_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int count=1;

        for(int i=0;i<=str.length()-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of words in String are :"+count);
    }
}
