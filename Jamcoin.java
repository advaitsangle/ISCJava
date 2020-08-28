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
        int dec = binToDec(n);
        int temp;
        for(int i = 1; i<=10; i++){
            if(primeCheck(decToBase(i, dec))) return false;
        }
        if(binaryChecker(dec)==false) return false;
        if(oneChecker(dec)==false) return false;

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
        if(str.charAt(0)=='1' && str.charAt(str.length()-1) == '0') {return true;}
        else return false;
    }

    boolean primeCheck(int n){
        int factors = 0;
        for(int k = 2; k<=Math.sqrt(n); k++)
            if(n%k==0) factors++;
        if(factors == 0) return true;
        else return false;   
    }

    int binToDec(int n){
        int ans = 0, c=0;
        while(n>0){
            ans+=(n%10) * Math.pow(2,c);
            n/=10;
            c++;
        }
        return ans;
    }

    int decToBase(int base, int n){
        String bin="";
        int r;
        while(n>0)
        {
            r=n%base;
            bin=r+bin;
            n/=base;
        }
        return Integer.parseInt(bin);
    
    }
}