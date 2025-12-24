//program to Find the intersection of two array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Intersection_Array {
    public static void main(String[] args) {
        int ar1[]={1,2,3,4,5,6};
        int ar2[]={2,5,3,7,9,8,70};
        System.out.println(Arrays.toString(reult(ar1, ar2)));
    }

    public static int[] reult(int[] ar1, int[] ar2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n2 : ar2) {
            set.add(n2);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int n1 : ar1) {
            if (set.contains(n1)) {
                list.add(n1);
                set.remove(n1);
            }
        }
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
