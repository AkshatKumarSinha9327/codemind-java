import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++)
        {
            int n=sc.nextInt(),a=sc.nextInt();
            if (a%2==0)
            {
                if (n==1)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Impossible");
                }
            }
            else
            {
                if (n%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
        }
    }
}