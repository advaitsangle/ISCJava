
import java.util.*;
public class FourthFive{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        FourthFive obj = new FourthFive();
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        //int[][] a = new int [5][5];
        //for(int i = 0; i<a.length; i++){
        //    System.out.println("ROW " + (i+1) + "\n---------------------------");
        //    for(int j = 0; j<a[0].length; j++){
        //        a[i][j] = sc.nextInt();
        //    }
        //}
        int[][]a = {{1,2,1,4,1}, {6,1,0,1,0}, {1,78,1,2,1}, {9,1,0,1,0}, {3,0,1, 29,1}};
        int[]b = {1,2,1,4,1,6,1,0,1,0, 1,78,1,2,1, 9,1,0,1,0, 3,0,1, 29,1};
        while(ch!=6){
            switch(ch){
                case 1: obj.q1(a); break;
                case 2: obj.q2(a); break;
                case 3: obj.q3(a); break;
                case 4: obj.q4(a); break;
                case 5: obj.q5(b); break;
                case 6: break;
                default: System.out.println("Enter a valid option"); break;
            }
            break;
        }    
    }
    void q1(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[j][i]+ "\t" );
            }
            System.out.println();
        }
    }
    void q2(int[][] a){
        //Q352
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(i>j){
                    int temp = a[j][i];
                    a[j][i] = a[i][j];
                    a[i][j] = temp;
                }
            }
            System.out.println();
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void q3(int[][] a){
        //Q353
        int[][] b = new int[a.length][a[0].length];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                b[i][j] = a[j][i];
            }
            System.out.println();
        }
        boolean flag = true;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(a[i][j] != b[i][j]) {flag = false; break;}
            }
            System.out.println();
        }
        if(flag) System.out.println("Symmetrical");
        else System.out.println("Assymetrical");
    }
    void q4(int[][] a){
        //Q354
        int[] b = new int[a.length*a[0].length];
        int k=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                b[k] = a[i][j];
                k++;
            }
        }
        for(int i = 0; i<b.length; i++){
                System.out.print(b[i]+" ");
         }
    }
    void q5(int[] a){
        int[][] b = new int[5][5];
        int i =0, j=0;
        for(int k = 0; k<a.length; k++){
            b[i][j] = a[k];
            j++;
            if(j==5){j=0; i++;}
            if(i==5)break;
        }
        for(i = 0; i<b.length; i++){
            for(j = 0; j<b[0].length; j++){
                System.out.print(b[i][j]+ "\t");
            }
            System.out.println();
        }
        
    } 
    
}
