import java.util.*;
public class Rectangles{
  int len, br, area;

  public Rectangles(){
    this.len=0;
    this.br=0;
  }

  public Rectangles(int len, int br){
    this.len=len;
    this.br=br;
  }
  public int area(){
    area = len*br;
  }
  public void display(){
    System.out.println("Area is " + area);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter length and breadth");
    Rectangles r = new Rectangles(sc.nextInt(), sc.nextInt());
    r.area();
    r.display();
  }
}