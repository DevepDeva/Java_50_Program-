//Program to find minimum Array in Java
public class Min_Numb_Array {
    public static void main(String[] args) {
        int arr[]={10,50,80,70,90};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Array number with minimum value : "+min);
    }
}
