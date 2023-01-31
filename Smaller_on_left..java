import java.util.*;

class sol
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
            // System.out.println(arr[i]);
        }
        System.out.print(-1+" ");
        for(int i =1 ; i < n ;i++)
        {
            int sm = arr[i];
            for(int j = i; j>=0 ;j--)
            {
                if (sm > arr[j])
                {
                    sm = arr[j];
                    break;
                }
            }
            if(sm == arr[i])
            {
                System.out.print(-1+" ");
            }
            else{
                System.out.print(sm+" ");
            }
        }
    }
}