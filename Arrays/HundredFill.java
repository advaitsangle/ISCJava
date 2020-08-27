public class HundredFill{
  public static void main(){
    int[] a = new int[10];
    for(int i = 0; i<=99; i++)
      a[i]=i+1;
    for(int k = 0; k<=99; k+=3){
      a[k]=0;
      if(k>=99)k=0;
      while(checkZero());
    }
  }
}