import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0 ;
        for(int i = 0 ; i < s.length() ;i++)
        {
            if ( s.charAt(i)>='1' && s.charAt(i)<='9')
            {   
                int val = s.charAt(i);
                sum = sum + val-48;
            }
        }
        System.out.print(sum);
    }
}