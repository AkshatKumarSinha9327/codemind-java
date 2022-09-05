import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt(),i;
        i=1;
        while(i<=r)
        {
            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n*i);
            i+=2;
        }
    }
}