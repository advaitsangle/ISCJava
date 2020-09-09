import java.util.*;
class Q12
{
    public static void main()
    {
        Q12 obj = new Q12();
        String s;
        int c = 0;
        String longest = "";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc1.nextLine(); 
        StringTokenizer sc2= new StringTokenizer(s,"?.,! ");
        int[] a = new int[sc2.countTokens()];
        String[] words = new String[sc2.countTokens()];
        int l = 0;
        while(sc2.hasMoreTokens())                          
        {                                      
            words[l] = sc2.nextToken();
            a[l] = obj.vowelCount(words[l]);
            l++;
            
        }
        int k;
        
        int temp = 0; String temp2;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<(a.length)-i-1; j++){
                if(a[j]<a[j+1]){
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
    public int vowelCount(String s){
        int c=0;
        s=s.toLowerCase();
        for(int i = 0; i<=s.length()-1; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
                c++;
        }
        return c;
    }
}
