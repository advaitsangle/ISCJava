import java.util.Scanner;
public class NewSumFactPattern{
    public static void main(String[] args){
        SumFactPattern obj = new SumFactPattern();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        double sum = 0;
        for(int i = 1; i<=n; i++){
            sum+= Math.pow(x,i)/(obj.factorial(i));
        }
        System.out.println(sum);
    }
    public int factorial(int n){
        int prod = 1;
        for(int i = n; i>=1; i--) prod*=i;
        return prod;
    }
}