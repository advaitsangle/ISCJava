import java.util.Scaner;      
public class GCD{
  Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    System.out.println("Enter two numbers);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int lim = (a>b)?b:a;
    int gcd = 1;
    for(int i = lim; i>=1; i--){
      if(a%i==0)&&(b%i==0){
        gcd = i;
        break;
      }
    }
    System.out.println("The GCD is "+ gcd);
  }
}