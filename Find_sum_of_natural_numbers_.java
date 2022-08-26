import java.util.*;


class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(),s=0;
        for (int i=1;i<=n;i++)
        {
            s+=i;
        }
        System.out.print(s);
    }
}