import java.util.*;
public class EvenOdd{
  public static void main(String[] args){
    int[] a = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values");
    for(int m=0; m<a.length; m++)a[m]=sc.nextInt();
    int odd = 0, even=0;
    for(int i=0; i<a.length; i++){
      if(a[i]%2==0)even+=a[i];
      else odd+=a[i];
    }
    System.out.println("Sum of even numbers" + even);
    System.out.println("Sum of odd numbers" + odd);
  }
}