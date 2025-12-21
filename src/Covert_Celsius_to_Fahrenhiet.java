// Convert Celsius to Fahrenheit

import java.util.Scanner;
public class Covert_Celsius_to_Fahrenhiet {
    public static void main(String[] args) {
        float far,cel;
        System.out.println("Enter the degree in celsius:");
        Scanner sc=new Scanner(System.in);
        cel=sc.nextFloat();
        far=((cel*9)/5)+32;
        System.out.println("Farenhit is "+far);
    }
}
