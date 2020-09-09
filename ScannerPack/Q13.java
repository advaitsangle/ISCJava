import java.util.*;
class Q13
{
    public static void main()
    {
        Q13 obj = new Q13();
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
        int maxIndex = 0;
        for(int i = 0; i<a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                maxIndex = i;
                if(a[j]<a[maxIndex])
                    maxIndex=j;
                if(maxIndex!=i){
                    temp = a[i];
                    a[i] = a[maxIndex];
                    a[maxIndex] = temp;
                    
                    temp2= words[i];
                    words[i] = words[maxIndex];
                    words[maxIndex] = temp2;
                }
            }
        }    
        for(k = 0; k<=a.length-1; k++)
            System.out.println(words[k]);
        
    }
}
