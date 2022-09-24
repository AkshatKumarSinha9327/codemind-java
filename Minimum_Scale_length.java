import java.util.*;

class sol{
    static int gcd(int a,int b)
    {
        if (a%b==0)
        {
            return b;
        }
        return gcd(b,a%b);
        
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
        int g=gcd(arr[0],arr[1]);
        for(int i=2;i<n;i++)
        {
            g = gcd(g,arr[i]);
        }
        System.out.print(g);
        
    }
}