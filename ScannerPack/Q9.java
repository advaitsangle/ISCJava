 import java.util.*;
class Q9
{
    public static void main()
    {
        String s,w, word;
        int c = 0;
        String longest = "";
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        s=sc1.nextLine();                  
        word = sc1.nextLine();
        Scanner sc2=new Scanner(s);         
        while(sc2.hasNext())                          
        {                                      
            w=sc2.next();
            if(w.equals(word))c++;
        }
        if(c>0)System.out.println("Found " + c + " times."); 
        else System.out.println("Not found.");
        
        sc1.close();
        sc2.close();
    }
}
