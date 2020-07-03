import java.util.Scanner;
public class PowerAdd{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i<=n; i++){
            sum+= 1/(i*i);
        }
        System.out.println(sum);
    }
}