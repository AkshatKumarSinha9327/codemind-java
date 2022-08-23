import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for (int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            s+=a;
        }
        System.out.print(s);
    }
}