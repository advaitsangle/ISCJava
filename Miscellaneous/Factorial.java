import java.util.Scanner;
public class Factorial{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int prod = 1;
        for(int i =n; i>=1; i--) prod*=i;
        System.out.println(prod);
    }
}