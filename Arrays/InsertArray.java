import java.util.*;
public class InsertArray{
  public static void main(String[] args){
    int[] a = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values");
    for(int m=0; m<a.length; m++)a[m]=sc.nextInt();
    System.out.println("Enter location and value");
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] b = new int[11];
    for(int i = 0; i<=n-1; i++)
      b[i]=a[i];
    b[n]=l;
    for(int j=n+1; j<b.length; j++){
      b[j]=a[j-1];
    }
    for(int k=0; k<b.length; k++){
      System.out.println(b[k]);
    }
  }
}