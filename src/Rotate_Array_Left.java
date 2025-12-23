//Program to Rotate a array to the left by k positions.

public class Rotate_Array_Left {
    static void reverse(int []arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int []arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+ arr.length;
        }
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        rotate(arr,3);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
