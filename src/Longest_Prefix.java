//Program to  Find the longest common prefix of a list of strings

import java.util.Arrays;

public class Longest_Prefix {
    public static void main(String[] args) {
        String str[]={"clap","clap","clame"};
        System.out.println("The longest Common Prefix of a String is : "+longestprefix(str));
    }

    private static String longestprefix(String[] str) {
        StringBuilder result=new StringBuilder();

        Arrays.sort(str);

        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
