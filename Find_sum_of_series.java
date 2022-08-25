import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        double s =0;
        for (double i=1;i<=n;i++)
        {
            s = s + 1/i;
            // System.out.println(1/i);
        }
        System.out.format("%.2f",s);
    }
}