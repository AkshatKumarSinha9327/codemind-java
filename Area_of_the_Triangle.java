import java.util.*;

class sol{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a=  sc.nextFloat(),b=  sc.nextFloat(),c=  sc.nextFloat();
        double s = (a+b+c)/2;
        double area  = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}