import java.util.*;

class sol{
    
    static boolean palin(int n)
    {
        int temp = n;
        int rev =0 ;
        while (temp!=0)
        {
            rev = rev *10 + temp%10;
            temp/=10;
        }
        if (rev==n)
        {
            return true;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(),c=0;
        for (int i=0;i<n;i++){
            if (palin(sc.nextInt()))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}