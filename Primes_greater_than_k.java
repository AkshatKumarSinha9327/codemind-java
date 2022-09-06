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
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(),c=0;
        for(int i=0;i<n;i++)
        {
            if (prime(arr[i])&&arr[i]>=k)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}