import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        if (n%2==0)
        {
            for (int i=0;i<n/2;i++)
            {
                System.out.format("%d %d ",arr[i],arr[n-1-i]);
            }
        }else{
            for (int i=0;i<n/2;i++)
            {
                System.out.format("%d %d ",arr[i],arr[n-1-i]);
            }
            System.out.format("%d %d",arr[n/2],0);
        }
    }
}