import java.util.*;
public class Armstrong{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int copy = a;
        int s = 0;
        while(a>0){
            s+=Math.pow((a%10), 3);
            a/=10;
        }
        if(s==copy)System.out.println("Armstrong number");
    }
}