//Program to Find the longest word in a string

import java.util.Scanner;

public class Longest_Word {
    public static void main(String[] args) {
        System.out.println("Enter a line: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str + " ";
        String w = "";
        int ind = 0, l = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String word = str.substring(ind, i);
                if (word.length() > l) {
                    w = word;
                    l = word.length();
                }
                ind = i;
            }
        }
        System.out.println("Longest word : " + w);

    }
}
