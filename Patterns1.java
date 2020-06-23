public class Patterns1{
  public static void main(String[] args){
    String s = "EDCBA";
    for(int i = 0; i<=5; i++){
      for(int j = 0; j<=5; j++){
        System.out.print(s.charAt(j));
      }
      System.out.println();
    }
  }
}