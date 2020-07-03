import java.util.Scanner;
public class SumFactPattern{
    public static void main(){
        SumFactPattern obj = new SumFactPattern();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i<=n; i++){
            sum+= Math.pow(-1, i)*(i)/(obj.factorial(i));
        }
        System.out.println(sum);
    }
    public int factorial(double n){
        int prod = 1;
        for(int i = (int)n; i>=1; i--) prod*=i;
        return prod;
    }
}