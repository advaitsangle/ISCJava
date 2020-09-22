import java.io.*;
import java.util.*;
class CricketRead
{
    public static void main(String args[]) throws IOException  
    {
        FileReader fr=new FileReader("Friends.Txt");
        BufferedReader br = new BufferedReader(fr);
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
                if(r<3000)continue;
                avg=(double)r/i;
                System.out.println(n+"\t"+r+"\t"+i+"\t\t"+avg);
            }
        }while(s!=null);   
        br.close();
    }
}