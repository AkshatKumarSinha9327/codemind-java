import java.util.*;

class sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'v' || ch ==  'V'){
            System.out.print("Violet");
        }
        else if (ch == 'i' || ch == 'I'){
            System.out.print("Indigo");
        }
        
        else if (ch == 'b' || ch == 'B'){
            System.out.print("Blue");
        }
        else if (ch == 'g' || ch == 'G'){
            System.out.print("Green");
        }
        else if (ch == 'y' || ch == 'Y'){
            System.out.print("Yellow");
        }
        else if (ch == 'o' || ch == 'O'){
            System.out.print("Orange");
        }
        else if (ch == 'r' || ch == 'R'){
            System.out.print("Red");
        }
        else{
            System.out.print(-1);
        }
        
    }
}