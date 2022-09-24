import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
    }
}