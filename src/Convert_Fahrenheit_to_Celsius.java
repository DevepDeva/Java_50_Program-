//Convert Fahrenheit to Celsius

import java.util.Scanner;
public class Convert_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float faren,cel;
        System.out.println("Enter degree in farenhit ");
        faren=sc.nextFloat();
        cel=((faren-32)*5)/9;
        System.out.println("Celcius is "+cel);
    }
}
