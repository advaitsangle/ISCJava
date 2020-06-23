public class Patterns5{
    public static void main(){
        String s = "EDCBA";
        for(int i = 4; i>=0; i--){
          for(int j = 0; j<=i; j++){
              System.out.print(s.charAt(j));
            }
          System.out.println();
        }
    }
}