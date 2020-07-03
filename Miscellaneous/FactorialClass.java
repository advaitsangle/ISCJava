import java.util.Scanner;
public class FactorialClass{
    public int factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int prod = 1;
        for(int i =n; i>=1; i--) prod*=i;
        return prod;
    }
}