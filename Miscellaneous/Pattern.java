import java.util.*;
public class Pattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of terms");
    int n = sc.nextInt();
    int a = 2;
    int b = 4;
    for(int i = 1; i<=n; i++){
      System.out.println(a);
      a+=b;
      b+=2;
    }
  }
}