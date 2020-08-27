import java.util.Scanner;
public class DayOfWeek{
  public static void main(String argsp[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number from 1-7");
    int a = sc.nextInt();
    String day;
    switch(a){
      case 1: day = "Monday"; break;
      case 2: day = "Tuesday"; break;
      case 3: day = "Wednesday"; break;
      case 4: day = "Thursday"; break;
      case 5: day = "Friday"; break;
      case 6: day = "Saturday"; break;
      case 7: day = "Sunday"; break;
      default: day = "N/A"; break;
    }
    System.out.println("The day of week is "+ day);
  }
}