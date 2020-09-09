 import java.util.*;
class Q5
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
            w=sc2.next().toLowerCase();
            for(int i = 0; i<=w.length()-1; i++){
                if(w.charAt(i)=='a' || w.charAt(i)=='e' || w.charAt(i)=='i' || w.charAt(i)=='o' || w.charAt(i)=='u')
                    c++;
            }
            System.out.println(c);
            c=0;
        }
        
        sc1.close();
        sc2.close();
    }
}
