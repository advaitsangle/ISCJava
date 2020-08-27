public class SumOfDiag{
  public static void main(String[] args){
    int[][]a = {{1,3,4},{5,6,3},{4,8,9}};   
    int sumleft = 0, sumright=0; 
    for(int i = 0; i<a.length; i++){
      for(int j = 0; j<a[0].length; j++){
        if(i==j)sumleft+=a[i][j];
        if(i+j==2)sumright+=a[i][j];
      }
    }
    System.out.println("The left diagonal is "+ sumleft);
    System.out.println("The right diagonal is "+ sumright);
  }
}