import java.util.*;
public class LastTwo{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        LastTwo obj = new LastTwo();
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        int[][] a = new int [5][5];
        for(int i = 0; i<a.length; i++){
            System.out.println("ROW " + (i+1) + "\n---------------------------");
            for(int j = 0; j<a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        while(ch!=3){
            switch(ch){
                case 1: obj.q1(a); break;
                case 2: obj.q2(a); break;
                case 3: break;
                default: System.out.println("Enter a valid option"); break;
            }
            break;
        }
    }
    void q1(int[][] a){
        for(int i = 0; i<a.length; i++){
            int[] sorted = bubbleSort(a[i]);
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]+ "\t" );
            }
            System.out.println();
        }
    }
    int[] bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] < arr[j+1]){ 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
        return arr;
    } 
    void q2(int[][] a){
        Scanner sc = new Scanner(System.in);
        int[][] b = new int [5][5];
        int[][] c = new int[5][5];
        for(int i = 0; i<a.length; i++){
            System.out.println("ROW " + (i+1) + "\n---------------------------");
            for(int j = 0; j<a[0].length; j++){
                b[i][j] = sc.nextInt();
                c[i][j]= b[i][j] + a[i][j];
            }
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(c[i][j]+ "\t" );
            }
            System.out.println();
        }
    }
}