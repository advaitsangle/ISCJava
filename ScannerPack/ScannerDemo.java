 import java.util.*;
class ScannerDemo
{
    public static void main()
    {
        String s,w;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        s=sc1.nextLine();                      // s="He is good"
        Scanner sc2=new Scanner(s);            // sc2                  sc2.hasNext()  w
        sc2.useDelimiter("_");               // "He" "is" "good"        true        He
        while(sc2.hasNext())                   // "is" "good"             true        is
        {                                      // "good"                  true        good
            w=sc2.next();                      //                         false
            System.out.println(w+"\t"+w.length());
        }
        
        sc1.close();
        sc2.close();
    }
}