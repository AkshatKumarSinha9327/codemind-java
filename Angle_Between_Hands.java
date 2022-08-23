import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);
        String time = sc.next();
        double h=(time.charAt(0) - 48)*10 + time.charAt(1) - 48;
        double m = (time.charAt(3) - 48)*10 + time.charAt(4) - 48;
        double angle = 11*m/2  - 30*h;
        if (angle<0)
        {
            angle+=360;
        }
        if(angle>180)
        {
            angle = 360 - angle;
        }
        System.out.print(angle);
    }
}