import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ;i++)
        {
            if (s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                cnt++;
            }
        }
        if (cnt==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else{
            
        System.out.println("Contains "+cnt+" digit");
        }
    }
}