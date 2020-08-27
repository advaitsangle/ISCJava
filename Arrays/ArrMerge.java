public class ArrMerge{
  public static void main(String[] args){
    int[] a = {0,4,6,8,2};
    int[] b = {1,5,3,7,9};
    int[] c = new int[a.length+b.length];
    for(int i = 0; i<a.length; i++){
      c[(2*i)]=a[i];
      c[(2*i)+1]=b[i];
    }
    for(int j = 0; j<c.length; j++){
      System.out.println(c[j]);
    }
  }
}