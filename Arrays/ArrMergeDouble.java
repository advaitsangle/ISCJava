public class ArrMergeDouble{
  public static void main(String[] args){
    int[] a = {0,4,6,8,2,10};
    int[] b = {1,5,3,7,9, 11};
    int[] c = new int[a.length+b.length];
    int i = 0;
    for(int j = 0; j<c.length;){
      c[j]=a[i];
      c[j+1]=a[i+1];
      j+=4;i+=2;
    }i=0;
    for(int k = 2; k<c.length;){
      c[k]=b[i];
      c[k+1]=b[i+1];
      k+=4;i+=2;
    }
    for(int l = 0; l<c.length; l++){
      System.out.println(c[l]);
    }
  }
}
