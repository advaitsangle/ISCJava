import java.util.*;
public class VowelCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char ch = sc.nextLine().charAt(0);
    switch(ch){
      case 'a': case 'e':case 'i': case 'o': case 'u':
      case 'A': case 'E':case 'I': case 'O': case 'U':
        System.out.println("Vowel"); break;
      default: System.out.println("Not vowel");
    }
  }
}