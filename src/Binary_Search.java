//Program to  Implement binary search
public class Binary_Search {
    static int binarysearch(int[] arr,int key){
        int l=0,h=arr.length-1,mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60,70,80,90};

        System.out.println(binarysearch(arr,50));


    }
}
