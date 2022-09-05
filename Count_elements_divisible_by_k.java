import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),i;
        int [] arr = new int[n];
        int c=0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i]%k==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}