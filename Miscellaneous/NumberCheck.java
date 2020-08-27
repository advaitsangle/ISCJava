import java.util.*;
public class NumberCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum = 0;
    int copy = n;
    String a = ""+n;
    int len = a.length();
    int c = len;
    while(copy>=1){
      sum+= Math.pow((copy%10),c);
      c--;
      copy/=10;
    }
    if(sum==n)System.out.println("True");
    else System.out.println("False");

  }
}