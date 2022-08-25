import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int a=0,b=1;
        System.out.print(a);
        System.out.print(' ');
        System.out.print(b);
        System.out.print(' ');
        for (int i=0;i<n-2;i++)
        {
            int d = a+b;
            System.out.print(d);
            System.out.print(' ');
            a= b;
            b = d;
        }
    }
}