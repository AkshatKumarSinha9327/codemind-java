import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i;
        int s=1;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s>n)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}