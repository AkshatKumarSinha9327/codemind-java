import java.util.*;

class sol
{
    public static boolean isperfect(int n)
    {
        for(int i = 1 ; i*i <= n; i++)
        {
            if(i*i == n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ;i++)
        {
            arr[i] = sc.nextInt();
            if(isperfect(arr[i]))
            {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}