import java.util.*;

class sol{
    static int len(int n)
    {
        int c=0;
        while(n!=0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if (len(arr[i])%2==0)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
        
    }
}