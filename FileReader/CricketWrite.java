import java.io.*;
class CricketWrite
{
    public static void main() throws IOException  
    {
        FileWriter fw=new FileWriter("Cricket.Txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String n;
        int r, i;

        System.out.println("Enter player name ");
        n=br.readLine();
        System.out.println("Enter Runs ");
        r=Integer.parseInt(br.readLine());
        System.out.println("Enter number of Innings");
        i=Integer.parseInt(br.readLine());
        pw.println(n+"~"+r+"~"+i);
        pw.close();
    }
}
