//Program to Calculate the sum of all elements in a Array
public class Sum_Of_Array {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of elements of array are : "+ sum);
    }
}
