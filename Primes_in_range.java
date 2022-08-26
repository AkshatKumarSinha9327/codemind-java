import java.util.*;

class sol{
    
    static boolean prime(int n)
    {
        if (n==0 || n==1){
            return false;
        }
        for (int i=2;i<(int )(Math.sqrt(n)) + 1;i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        for (int i=a;i<=b;i++)
        {
            if (prime(i))
            {
                c++;
            }
        }
        System.out.print(c);
    }
    
}