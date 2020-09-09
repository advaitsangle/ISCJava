 import java.util.*;
class Q7
{
    public static void main()
    {
        String s,w;
        String longest = "";
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        s=sc1.nextLine();                      
        Scanner sc2=new Scanner(s);         
        while(sc2.hasNext())                          
        {                                      
            w=sc2.next();
            for(int i = w.length()-1; i>=0; i--)System.out.print(w.charAt(i));
            System.out.println();
        }
        
        sc1.close();
        sc2.close();
    }
}
