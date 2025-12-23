//Program to Find the largest prime factor of a number
import java.util.HashSet;

public class Largest_Prime_Factor {
    private static void largetprime(int num){
        HashSet<Integer> hashset=new HashSet<>();

        for(int i=2;i<=num;i++){
            while(num%i==0){
                hashset.add(i);
                num=num/i;
            }
        }
        int max=0;
        for(Integer integer:hashset){
            System.out.println(integer);

            if(integer > max){
                max=integer;
            }
        }
        System.out.println("Largest Prime Factor is : "+max);
    }
    public static void main(String[] args) {
        int num=315;
        largetprime(num);

    }

}
