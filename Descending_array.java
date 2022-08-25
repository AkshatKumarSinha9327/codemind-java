import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int flag=1;
        for (int i=0;i<n-1;i++)
        {
            if (arr[i]<arr[i+1])
            {
                flag=0;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}