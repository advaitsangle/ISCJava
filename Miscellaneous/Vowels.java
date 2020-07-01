//Given a character , check whether it is a vowel
import java.util.Scanner;
class vowel {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System. out. println("Input a character");
    char ch = sc.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    System. out. println("vowel");
    else
    System. out. println("not vowel");
  }
}