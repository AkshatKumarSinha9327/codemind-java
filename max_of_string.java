import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = 'a';
        for(int i = 0 ; i < s.length() ;i++)
        {
            if (s.charAt(i)>c)
            {
                c = s.charAt(i);
            }
        }
        System.out.println(c);
    }
}