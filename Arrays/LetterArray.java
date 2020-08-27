public class LetterArray{
  public static void main(String[] args){
    char[] a = new char[26];
    for(int i = 0; i<=25; i++)
      a[i]=(char)(i+65);
    for(int i = 0; i<=25; i+=2)
      a[i]=(char)(i+97);
    for(int i = 0; i<=25; i++)
      System.out.println(a[i]);
      
  }
}