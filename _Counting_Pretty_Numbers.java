import java.util.*;


class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt(),b=sc.nextInt();
            int c=0;
            for (int j=a;j<=b;j++)
            {
                if (j%10==2 || j%10==3 || j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}