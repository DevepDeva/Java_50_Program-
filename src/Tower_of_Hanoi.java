//Program to Implement the Tower of Hanoi problem
public class Tower_of_Hanoi {
    public static void towerofHanoio(int n,char src,char aux,char dest){
        if(n==1){
            System.out.println(src+" ---> "+dest);
            return;
        }
        towerofHanoio(n-1,src,dest,aux);
        towerofHanoio(1,src,aux,dest);
        towerofHanoio(n-1,aux,src,dest);

    }
    public static void main(String[] args) {

        towerofHanoio(3,'A','B','C');


    }

}
