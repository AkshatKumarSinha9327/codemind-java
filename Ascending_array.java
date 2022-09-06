import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int flag=0;
        for(i=0;i<n-1;i++)
        {
            if (arr[i]<arr[i+1])
            {
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if (flag==0)
        {
            System.out.print("no");
        }
        else{
            System.out.print("yes");
        }
    }
}