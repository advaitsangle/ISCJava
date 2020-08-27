import java.util.*;
public class ArrayFill{
  String[] a;
  String[] reverse;
  public ArrayFill(){
    a = new String[10];
  }
  public ArrayFill(int size){
    a = new String[size];
  }
  public Sting reverse(String b){
    String reverse;
    for(int i = b.length-1; i>=b.length; a--){
      reverse+=b.charAt(i);
    }
    return reverse;
  }
  public static void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int n = sc.nextInt();
    ArrayFill obj = new ArrayFill(n);
    for(int i=0; i<n; i++){
      obj.a[i]=sc.next();
    }
     for(int j=0; j<n; i++){
      obj.reverse[j]= obj.reverse(obj.a[i]);
    }
    for(int k=0; k<n; k++){
      System.out.println(obj.reverse[i]);
    }
  }

}