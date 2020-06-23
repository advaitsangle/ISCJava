public class Patterns12{
    public static void main(){
        for(int i = 5; i>=1; i--){
            int c=1;
            for(int j = 1; j<=i; j++){
              System.out.print(" ");
            }          
            for(int k = 1; k<=((6-i)*2)-1; k++){
                System.out.print(c);
                c+= (k>=(6-i))? -1 : 1;
            }
            System.out.println();
            c=1;
        }
    }
}