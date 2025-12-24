//Program to Sort a array using quicksort
public class QuickSort_Array {
    public static void quicksort(int []arr,int low,int high) {
        if(low<high){
            int pivind=partion(arr,low,high);

            quicksort(arr,low,pivind-1);
            quicksort(arr,pivind+1,high);
        }

    }

    private static int partion(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void main(String[] args) {

        int arr[]={20,40,85,55,77,12,30};
        int n=arr.length;
        quicksort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

}
