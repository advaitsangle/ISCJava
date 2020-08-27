import java.util.Scanner;
public class PrimeFactors{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PrimeFactors obj = new PrimeFactors();
        System.out.println("Enter number");
        int num = sc.nextInt();
        int factors = 0;
        int copy = num;
        int div = 2;
        while(num>=div){
            if(obj.checkPrime(div)){
                while(num%div==0){
                    System.out.println(div);
                    num/=div;
                }
            }
            div++;
        }
        System.out.println();
    }
    public boolean checkPrime(int num){
        int factors = 0;
        for(int k = 2; k<=num/2; k++)
            if(num%k==0){ factors++; break;}
        if(factors == 0)return true;
        return false;
    }
}
