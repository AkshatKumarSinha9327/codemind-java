import java.util.*;

class sol{
    
    static boolean prime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<n/2 + 1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime(n))
        {
            System.out.print("prime");
        }
        else{
            System.out.print("not a prime");
        }
    }
}