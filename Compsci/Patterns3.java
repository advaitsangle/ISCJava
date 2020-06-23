public class Patterns3{
  public static void main(){
    int c = 0;
    for(int i = 1; i<=5; i++){
      c+=i;
      for(int j = 0; j<=i-1; j++){
          System.out.print(c-j + " ");
        }
      System.out.println();
    }
  }
}