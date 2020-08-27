public class Recursion{
  int prod=1;
  int sum = 0;
  public static void main(String[] args){
    Recursion obj = new Recursion();
    System.out.println(obj.multi(28, 38));
  }
  public int sumOfDigits(int n){
    if(n==0) return 0;
    else return n%10 + sumOfDigits(n/10);
  }
  public int fact(int n){
    if(n==0)return 1;
    else return n*fact(n-1);
  }
  public int gcd(int n1, int n2)
  {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
  }
  public int pow(int a, int b){
    if(b==0) return prod;
    else{ prod*=a; return pow(a, b-1);}
  }

  public int multi(int a, int b){
    if(b==0) return sum;
    else{ sum+=a; return multi(a, b-1);}
  }


  //power 
  //multiple
}