import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hf=sc.nextInt(),sf=sc.nextInt(),spf=sc.nextInt();
        
        if (hf>50 && sf >60 && spf>100)
        {
            System.out.print(10);
        }
        else if (hf>50 && sf >60 && spf<100)
        {
            System.out.print(9);
        }
        else if (hf<50 && sf >60 && spf>100)
        {
            System.out.print(8);
        }
        else if (hf>50 && sf <60 && spf>100)
        {
            System.out.print(7);
        }
        else if ((hf>50 && sf <60 && spf<100) || (hf<50 && sf >60 && spf<100) || (hf<50 && sf <60 && spf>100) )
        {
            System.out.print(6);
        }
        else{
            System.out.print(5);
        }
    }
}