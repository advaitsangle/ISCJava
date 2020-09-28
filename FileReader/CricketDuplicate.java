import java.io.*;
import java.util.*;
class CricketDuplicate
{
    public static void main(String args[]) throws IOException  
    {
        FileReader fr=new FileReader("Friends.Txt");
        BufferedReader br = new BufferedReader(fr);
        
        FileWriter fw=new FileWriter("Cricket.Txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        String s,n;
        int r,i;
        double avg;
        System.out.println("Name\tRuns\tInnings\t\tAverage");
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
                
                pw.println(n+"~"+r+"~"+i+"~"+avg);

            }
        }while(s!=null);   
        br.close();
        pw.close();
    }
}