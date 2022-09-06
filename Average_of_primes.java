import java.util.*;

class sol{
    
    static boolean prime(int n)
    {
        if (n==0 || n==1)
        {
            return false;
        }
        int i;
        for(i=2;i<n/2 +1;i++)
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
        int n=sc.nextInt(),i;
        double s=0,c=0;
        int [] arr = new int[n];
        
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            
            if (prime(arr[i]))
            {
                s+=arr[i];
                // System.out.println(arr[i]);
                c++;
            }
        }
        System.out.format("%.2f",s/c);
        
    }
}