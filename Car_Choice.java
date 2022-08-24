import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i=0;i<n;i++)
        {
            double x1=sc.nextInt(),x2=sc.nextInt(),y1=sc.nextInt(),y2=sc.nextInt();
            double car1 = y1/x1,car2 = y2/x2;
            if (car1<car2){
                System.out.println(-1);
            }
            else if (car1>car2){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}