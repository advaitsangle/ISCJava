 import java.util.*;
class Q6
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
            if(w.length()>longest.length())longest = w;
        }
        System.out.println("Longest word is " + longest);
        
        sc1.close();
        sc2.close();
    }
}
