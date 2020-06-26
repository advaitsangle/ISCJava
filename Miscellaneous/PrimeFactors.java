import java.util.Scanner;
public class PrimeFactors{
  public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      PrimeFactors obj = new PrimeFactors();
      System.out.println("Enter number");
      int num = sc.nextInt();
      int factors = 0;
      int copy = num;
      int div = 2;
      while(num>=div){
              while(num%div==0){
                  System.out.println(div);
                  num/=div;
              }
          }
      div++;
  }
}   