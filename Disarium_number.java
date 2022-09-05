import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,c=0;
        while(temp>0)
        {
            c++;
            temp/=10;
        }
        int s=0;
        temp = n;
        while (temp>0)
        {
            s+= Math.pow(temp%10,c);
            c--;
            temp/=10;
        }
        if (s==n)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}