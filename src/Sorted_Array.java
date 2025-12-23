//Program for Check if an Array is sorted
public class Sorted_Array {
    static boolean sortedarray(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[]={10,20,30,40,20,60,80,90};

        System.out.println(sortedarray(arr));



    }
}
