// fibonacci sequence
// decimal to binary

public class Recursion2{
  public static void main(String[] args){
    Recursion2 obj = new Recursion2();
    for(int i=1; i<=10; i++)
      System.out.println(obj.dtb(i));
  }
  public int fibo(int n){
    if(n==1) return 0;
    else if (n==2) return 1;
    else return fibo(n-1) + fibo(n-2);
  }
  public String dtb(int n){
    if(n==1)return "1";
    else return ""+ dtb(n/2) + n%2;
  }
  }
