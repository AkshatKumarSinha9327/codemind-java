import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        int odd = 0 , even = 0;
        for(int i = 0 ; i < n ; i++ )
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println(even+" "+odd);
    }
}