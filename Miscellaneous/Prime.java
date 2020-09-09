import java.util.Scanner;
public class Prime{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int factors = 0;
        for(int k = 2; k<=num/2; k++)
            if(num%k==0){ factors++; break;}
        if(factors == 0)System.out.print("Prime Number");
        else System.out.println("Not a Prime Number");   
    }
}
