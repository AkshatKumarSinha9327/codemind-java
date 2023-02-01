import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),zc=0,oc=0;
        int arr [] = new int[n];
        for(int i = 0 ; i < n ;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]==1)
            {
                oc++;
            }
            else
            {
                zc++;
            }
        }
        for(int i= 0 ; i < zc ;i++)
        {
            System.out.print(0+" ");
        }
        for(int i= 0 ; i < oc ;i++)
        {
            System.out.print(1+" ");
        }
    }
}