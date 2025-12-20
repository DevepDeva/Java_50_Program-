//Program to Calculate the area of a circle.

import java.util.Scanner;
public class Area_Of_Circle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius ");
        int radius=sc.nextInt();
        float pi=3.14f;
        float area=pi*(radius*radius);
        System.out.println("Area of a Circle: "+area);

    }

}
