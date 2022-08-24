import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k==0 || k==1){
            System.out.print(0);
        }
        if (k==2){
            System.out.print(1);
        }
        if (k>2){
            System.out.print(2);
        }
    }
}