import java.util.*;
public class FactorsEfficient{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int factors = 0;
        for(int k = 2; k<=Math.pow(num, 0.5); k++)
            if(num%k==0){ System.out.println(k+"\t"+num/k);}   
    }
}