import java.util.*;

class sol
{
    public static boolean isprime(int n)
    {
        if (n==0 || n==1)
        {
            return false;
        }
        if (n==2)
        {
            return true;
        }
        for(int i = 2 ; i < Math.sqrt(n)+1;i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),cnt = 0;
        for(int i= 2 ; i*i<=n ;i++)
        {
            if (isprime(i))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}