import java.util.*;
public class ReverseInt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum = 0;
        int place = 1;
        while(a>0){
          sum =sum*10;
          sum+=a%10;
          a/=10;
        }
        System.out.println(sum);
    }
}