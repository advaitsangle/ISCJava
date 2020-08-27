import java.util.Scanner;
public class PowerFactPattern{
    public int factorial(double n){
        int prod = 1;
        for(int i = (int)n; i>=1; i--) prod*=i;
        return prod;
    }
    public static void main(){
        PowerFactPattern obj = new PowerFactPattern();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        System.out.println("Enter x");
        int x = sc.nextInt();
        double sum=0;
        for(double i = 1; i<=n; i++){
            sum+= Math.pow(x,i)/obj.factorial(i);
        }
        System.out.println(sum);
    }
}
