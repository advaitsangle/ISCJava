import java.util.*;
public class Disarium{
  public static void main(String[] args){
    Disarium obj = new Disarium();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range");
    int n = sc.nextInt();
    int k=0;
    for(int i=0; i<n; k++){
      if(obj.disariumCheck(""+k)){
        System.out.println(k); i++;
      }
    }
  }
  public boolean disariumCheck(String a){
    int sum=0;
    for(int i = 0; i<a.length(); i++){
      sum+= Math.pow(Character.getNumericValue(a.charAt(i)),i+1);
    }
    if(sum==Integer.parseInt(a))
      return true;
    return false;
  }
}