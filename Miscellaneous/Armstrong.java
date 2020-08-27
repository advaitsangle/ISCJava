import java.util.*;
public class Armstrong{
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        String b = ""+a; int digs = b.length();
        int copy = a;
        int s = 0;
        while(a>0){
            s+=Math.pow((a%10), digs);
            a/=10;
        }
        if(s==copy)System.out.println("Armstrong number");
        else System.out.println("Not an Armstrong number");
    }
}