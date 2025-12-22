//Program to  Find the second largest element in a array
public class Second_Largest_Array {
    public static void main(String[] args) {
        int arr[]={10,20,20,50,40,80,90,10};
        int max=arr[0];
        int secondmax=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secondmax)
            {
                secondmax=arr[i];
            }

        }
        System.out.println("Second largest elemnt of an array is :"+secondmax);


    }
}
