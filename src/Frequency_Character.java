//Program to find frequency of characters in a string

import java.util.HashMap;
import java.util.Map;

public class Frequency_Character {
    public static void main(String[] args) {

        String input="idiot";
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<input.length();i++){

            Character ch=input.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(" "+ map);
    }
}
