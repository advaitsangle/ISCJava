import java.util.Scanner;      
public class LCM{
  public static void main(String args[]){
    System.out.println("Enter two numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i = a;
    while(true){
      if(i%a == 0 && i%b == 0)break;
      i+=a;
    }
    System.out.println("The LCM is " + i);
  }
}