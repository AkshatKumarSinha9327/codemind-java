import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int se =sc.nextInt();
        int in=-1,fi=-1;
        for (int i=0;i<n;i++)
        {
            if (arr[i]==se)
            {
                in = i;
                break;
            }
        }
        for(int i =n-1;i>=0;i--)
        {
            if (arr[i]==se)
            {
                fi = i;
                break;
            }
        }
        System.out.format("%d %d",in,fi);
    }
}