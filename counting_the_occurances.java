import java.util.*;

class sol
{
    public static void main(String []args)
    {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int cnt=0;
        for(int i = 0 ; i < s.length() ;i++)
        {
            if (s.charAt(i)==c)
            {
                cnt++;
            }
        }
        if (cnt==0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(cnt);
        }
    }
}