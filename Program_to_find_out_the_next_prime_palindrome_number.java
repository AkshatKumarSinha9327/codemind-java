import java.util.*;

class sol{
    
    static int prime(int n){
        if (n==1){
            return 0;
        }
        for (int i=2;i<n/2 + 1; i++)
        {
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
    
    static int palin(int n){
        int temp=n,rev = 0;
        while (temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        if (rev==n){
            return 1;
        }
        return 0;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int after =n+1 ;
        while (true)
        {
            if (prime(after)==1 && palin(after)==1)
            {
                break;
            }
            after+=1;
        }
        System.out.print(after);
    }
}