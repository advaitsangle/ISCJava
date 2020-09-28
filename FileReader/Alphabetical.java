import java.io.*;
import java.util.*;
public class Alphabetical
{
    public static void main(String args[]) throws IOException  
    {
        FileReader fr=new FileReader("Friends.Txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(System.in);
        String s,n;
        int r,i;
        double avg;
        String[] name = new String[6];
        int[] runs = new int[6];
        int[] innings = new int[6];
        int[] average = new int[6];
        
        System.out.println("Name\tRuns\tInnings\tAverage");
        int k = 0;
        do
        {
            s=br.readLine();    
            if(s!=null)
            {
                StringTokenizer st=new StringTokenizer(s,"~");
                n=st.nextToken();
                r=Integer.parseInt(st.nextToken());
                i=Integer.parseInt(st.nextToken());
                avg=(double)r/i;
                name[k] = n;
                runs[k] = r;
                innings[k] = i;
                average[k] = r/i;
                k++;
            }
        }while(s!=null);   
        br.close();
        
        
        int temp;
        String tempie;
        for(int p = 0; p<runs.length; p++){
          
            for(int q = 0; q<runs.length - p - 1; q++){
                if(name[q].charAt(0)>name[q+1].charAt(0)){
                    temp = runs[q];
                    runs[q] = runs[q+1];
                    runs[q+1] = temp;
                    
                    temp = innings[q];
                    innings[q] = innings[q+1];
                    innings[q+1] = temp;
                    
                    tempie = name[q];
                    name[q] = name[q+1];
                    name[q+1] = tempie;
                    
                    temp = average[q];
                    average[q] = average[q+1];
                    average[q+1] = temp;
                }
                 
            }
        }
        for(int t = 0; t<runs.length; t++)
              System.out.println(name[t]+"\t"+runs[t]+"\t"+innings[t]+"\t"+average[t]);
    }
}
