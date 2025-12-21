//Program to  Check if a year is a leap year.

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year ;
        boolean leap_year=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year : ");
        year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    leap_year=true;
                else
                    leap_year=false;
            }leap_year=true;
        }else
            leap_year=false;
        System.out.println(year +"is a leap year "+ leap_year);

    }
}
