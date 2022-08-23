import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ocount = 0;
        for (int i =0 ;i<n;i++)
        {
            if (arr[i]%2==1)
            {
                ocount+=1;
            }
        }
        if (ocount>2)
        {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}