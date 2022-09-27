import java.util.*;

class sol{
    
    static int count(int [] arr, int se){
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if (se == arr[i])
            {
                c++;
            }
            
        }
        return c;
    }
    static boolean in(int se,int [] temp){
        for(int i=0;i<temp.length;i++)
        {
            if (temp[i]==se)
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
        int [] arr = new int[n];
        int [] temp = new int[n];
        int t=0;
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        // int re = sc.nextInt();
        int flag=0;
        for (int i=0;i<n;i++)
        {
            if (count(arr,arr[i])==arr[i] && !in(arr[i],temp))
            {
                flag=1;
                temp[t++] = arr[i];
                System.out.format("%d ",arr[i]);
            }
        }
        if (flag==0)
        {
            System.out.print(-1);
        }
     }
}