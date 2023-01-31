import java.util.*;

class sol
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=0 ,cnt = 0 ;
        int arr [] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int hsh [] = new int[max+1];
        for(int i = 0 ; i < max ;i++)
        {
            hsh[i] = 0;
        }
        for(int i = 0; i < n ; i++ )
        {
            hsh[arr[i]]++;
        }
        for(int i = 0 ; i < n ;i++)
        {
            if (hsh[arr[i]]==1)
            {
                System.out.print(arr[i]);
                System.out.print(" ");
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.print(-1);
        }
    }
}
