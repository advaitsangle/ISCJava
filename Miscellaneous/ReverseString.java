import java.util.*;
public class Reverse{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = "" + sc.nextInt();
        for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}