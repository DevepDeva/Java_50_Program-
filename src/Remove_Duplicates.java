//Program for Remove duplicates from an Array
public class Remove_Duplicates {
    static int removeduplicates(int arr[]) {
        int rd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd + 1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 2, 3, 3, 4, 4, 6, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int rd = removeduplicates(arr);

        for (int i = 0; i < rd; i++) {
            System.out.print(arr[i]);
        }

    }
}
