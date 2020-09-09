import java.util.*;
public class FirstFive{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        FirstFive obj = new FirstFive();
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
                case 4: obj.q4(a); break;
                case 5: obj.q5(a); break;
                case 6: break;
                default: System.out.println("Enter a valid option"); break;
            }
            break;
        }    
    }
    void q1(int[][] a){
        for(int i = a.length-1; i>=0; i--){
            for(int j = a[0].length; j>=0; j--){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
    void q2(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
    void q3(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = a[0].length-1; j>=0; j--){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
    void q4(int[][] a){
        int zero=0, neg=0, pos=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j]==0)zero++;
                else if(a[i][j]>0)pos++;
                else neg++;
            }    
        }
        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
        System.out.println("Zeroes: " + zero);
    }
    void q5(int[][] a){
        int zero=0, neg=0, pos=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j]==0)zero++;
                else if(a[i][j]>0)pos++;
                else neg++;
            }
            System.out.println("ROW " + (i+1) + "\n---------------------------");
            System.out.println("Positives: " + pos);
            System.out.println("Negatives: " + neg);
            System.out.println("Zeroes: " + zero);
            zero=0;neg=0;pos=0;
        }
    }
}   