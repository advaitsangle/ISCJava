public class Patterns4{
    public static void main(){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((i%2==0)?(j*2):((j*2)-1));
            }
            System.out.println();
        }
    }
}