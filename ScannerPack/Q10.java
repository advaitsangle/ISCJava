import java.util.*;
class Q10
{
    public static void main()
    {
        String s,w, word, replace;
        int c = 0;
        String longest = "";
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence and two words");
        s=sc1.nextLine();                  
        word = sc1.nextLine();
        replace = sc1.nextLine();
        Scanner sc2=new Scanner(s);         
        while(sc2.hasNext())                          
        {                                      
            w=sc2.next();
            if(w.equals(word))System.out.print(replace + " ");
            else System.out.print(w + " ");
        }
       
        sc1.close();
        sc2.close();
    }
}
