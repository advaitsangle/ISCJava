 import java.util.*;
class Q4
{
    public static void main()
    {
        String s,w;
        int c = 0;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        s=sc1.nextLine();                      
        Scanner sc2=new Scanner(s);         
        while(sc2.hasNext())                          
        {                                      
            w=sc2.next();
            System.out.println(w+ "\t"+ w.length());
        }
        System.out.println(c);
        
        sc1.close();
        sc2.close();
    }
}
