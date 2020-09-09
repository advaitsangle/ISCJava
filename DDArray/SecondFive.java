import java.util.*;
public class SecondFive{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        SecondFive obj = new SecondFive();
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        int[][] a = new int [5][5];
        for(int i = 0; i<a.length; i++){
            System.out.println("ROW " + (i+1) + "\n---------------------------");
            for(int j = 0; j<a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        while(ch!=6){
            switch(ch){
                case 1: obj.q1(a); break;
                case 2: obj.q2(a); break;
                case 3: obj.q3(a); break;
                case 4: 
                    System.out.println("enter n");    
                    int n = sc.nextInt();
                    obj.q4(a, n); break;
                case 5: obj.q5(a); break;
                case 6: break;
                default: System.out.println("Enter a valid option"); break;
            }
            break;
        }    
    }
    void q1(int[][] a){
        int r, c, sum=0;
        int[] product = new int[a.length];
        for(int l=0; l<a.length; l++)product[l]=1;
        for(r=0; r< a.length; r++){                     //a.length -> rows
            for(c=0; c<a[r].length; c++){               //a[r].length -> columns
               sum+=a[r][c];
               product[c]*=a[r][c];
            }
            System.out.println("ROW "+ (r+1));
            System.out.println("Sum: " + sum);
            sum=0;
        }
        for(int k=0; k<a.length; k++)System.out.println(product[k]);
    }
    void q2(int[][] a){
        int sum=0;
        for(int i = 0; i<a.length; i++){
            sum+=a[2][i];
        }
        System.out.println("Sum of third row is " + sum);
    }
    void q3(int[][] a){
        int sum=0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i][a.length-1];
        }
        System.out.println("Sum of third row is " + sum);
    }
    void q4(int[][] a, int n){
        int sum=0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i][n];
            sum+=a[n][i];
        }
        sum-=a[n][n];
        System.out.println("Sum of nth row and column is " + sum);
    }
    void q5(int[][] a){
        int sum=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(a[i][j]%4==0)sum+=a[i][j];
            }
        }
        System.out.println("Sum of numbers div by 4 is " + sum);
    } 
    
}