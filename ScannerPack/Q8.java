 import java.util.*;
class Q8
{
    public static void main()
    {
        String s,w, word;
        boolean flag = false;
        String longest = "";
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        s=sc1.nextLine();                  
        word = sc1.nextLine();
        Scanner sc2=new Scanner(s);         
        while(sc2.hasNext())                          
        {                                      
            w=sc2.next();
            if(w.equals(word)){flag = true; break;}
        }
        if(flag)System.out.println("Found."); 
        else System.out.println("Not found.");
        
        sc1.close();
        sc2.close();
    }
}
