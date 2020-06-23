public class Patterns6{
    public static void main(){
        String s = "EDCBA";
        for(int i = 4; i>=0; i--){
          for(int j = 0; j<=i; j++){
              System.out.print(s.charAt(4-i));
            }
          System.out.println();
        }
    }
}