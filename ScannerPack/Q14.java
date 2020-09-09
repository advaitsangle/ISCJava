import java.util.*;
class Q14
{
    public static void main()
    {
        Q14 obj = new Q14();
        String s;
        int c = 0;
        String longest = "";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc1.nextLine(); 
        s = s.toLowerCase();
        StringTokenizer sc2= new StringTokenizer(s,"?.,! ");
        int[] a = new int[sc2.countTokens()];
        String[] words = new String[sc2.countTokens()];
        int l = 0;
        while(sc2.hasMoreTokens())                          
        {                                      
            words[l] = sc2.nextToken();
            a[l] = (int)words[l].charAt(0);
            l++;
            
        }
        int k;
        
        int temp = 0; String temp2;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<(a.length)-i-1; j++){
                if(a[j]>a[j+1]){
                    temp= a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    temp2= words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp2;
                }
            }
        }    
        for(k = 0; k<=a.length-1; k++)
            System.out.println(words[k]);
        
    }
}
