import java.util.*;
public class Jamcoin{
    boolean flag = true;
    public static void main(String[] args){
        Jamcoin j = new Jamcoin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary value of jamcoins");
        int n = sc.nextInt();
        if(j.jamCheck(n)) System.out.println("True");
        else System.out.println("False");
    }

    boolean jamCheck(int n){
        for(int i = 2; i<=10; i++){
            System.out.println(i);
            System.out.println(baseConvert(i, n));
            System.out.println(primeCheck(baseConvert(i, n)));
            if(primeCheck(baseConvert(i, n))) return false;
        }
        System.out.println("Binary Checker" + binaryChecker(n));
        System.out.println("One Checker" + oneChecker(n));
        if(binaryChecker(n)==false) return false;
        if(oneChecker(n)==false) return false;

        return true;
    }

    boolean binaryChecker(int n){
        String str=""+n;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== '0' || str.charAt(i)=='1') continue;
            else return false;
        }
        return true;
    }

    boolean oneChecker(int n){
        String str=""+n;
        if(str.charAt(0)=='1' && str.charAt(str.length()-1) == '1') {return true;}
        else return false;
    }

    boolean primeCheck(int n){
        int factors = 0;
        for(int k = 2; k<=Math.sqrt(n); k++)
            if(n%k==0) factors++;
        if(factors == 0) return true;
        else return false;   
    }
    
    int baseConvert(int base, int n){
        int sum=0, place=0;
        while(n>0){
            sum+= (n%10) * Math.pow(base,place);
            place++;
            n/=10;
        }
        return (sum);
    }
   
}