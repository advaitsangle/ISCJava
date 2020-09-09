    import java.util.*;
public class ThirdFive{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        ThirdFive obj = new ThirdFive();
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        while(ch<6){
            int[][] a = new int [5][5];
            for(int i = 0; i<a.length; i++){
                System.out.println("ROW " + (i+1) + "\n---------------------------");
                for(int j = 0; j<a[0].length; j++){
                    a[i][j] = sc.nextInt();
                }
            }
                switch(ch){
                    case 1: obj.q1(a); break;
                    case 2: obj.q2(a); break;
                    case 3: obj.q3(a); break;
                    case 4: obj.q4(a); break;
                    case 5: obj.q5(a); break;
                    default: System.out.println("Enter a valid option"); break;
                }
                break;
        }    
    }
    void q1(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(i==j)System.out.print(a[i][j]+" ");
            }
        }
    }
    void q2(int[][] a){
        int sum=0; 
        for(int i = 0; i<a.length; i++){
          for(int j = 0; j<a[0].length; j++){
            if(i==j)sum+=a[i][j];
            else if(i+j==2)sum+=a[i][j];
          }
        }
        System.out.println("The sum is "+ sum);
    }
    void q3(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(i==j){
                    int temp = a[i][j];
                    a[i][j]= a[i][a.length-j-1];
                    a[i][a.length-j-1]=temp;
                }
            }
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void q4(int[][] a){
        boolean flag=true;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(i==j){if(a[i][j]!=1){flag=false;break;}}
                else{if(a[i][j]!=0){flag=false;break;}}
            }
        }
        System.out.println(flag);
    }
    void q5(int[][] a){
        int c=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(primeCheck(a[i][j]))c++;
            }
        }
        System.out.println("Number of prime numbers is " + c);
    } 
    boolean primeCheck(int n){
        for(int i=3;i<=Math.sqrt(n);i+=2) { 
            if(n%i==0) 
                return false; 
            } 
        return true; 
    }
}
