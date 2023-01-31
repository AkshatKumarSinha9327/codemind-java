import java.util.*;

class sol
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vc = 0,cc = 0 , dc = 0, wsc = 0;
        for(int i = 0 ; i < s.length() ;i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                vc++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                dc++;
            }
            else if(s.charAt(i)==' ')
            {
                wsc++;
            }
            else{
                cc++;
            }
            
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonants: "+cc);
        System.out.println("Digits: "+dc);
        System.out.println("White spaces: "+wsc);
    }
}