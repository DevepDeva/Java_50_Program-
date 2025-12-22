//Program to Find the maximum of a Array

import java.util.Scanner;

public class Max_Num_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5]; int max;
        System.out.println("Enter array Elemnts: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum array number is : "+max);

    }
}
