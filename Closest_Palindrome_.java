import java.util.*;


class sol{
    
    static boolean palin (int n)
    {
        int temp=n;
        int rev = 0;
        while (temp>0)
        {
            rev = rev*10 +  temp%10;
            temp/=10;
        }
        if(rev==n)
        {
            return true;
        }
        return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int after = n+1,before=n-1;
        
        while (true)
        {
            if (palin(after))
            {
                break;
            }
            after++;
        }
        
        while (true)
        {
            if (palin(before))
            {
                break;
            }
            before--;;
        }
        
        if (after-n==n-before)
        {
            System.out.print(before);
            System.out.print(" ");
            System.out.print(after);
        }
        else if (after-n<n-before)
        {
            System.out.print(after);
        }
        else{
            System.out.print(before);
        }
    }
}