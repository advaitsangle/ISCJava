import java.io.*;
class Writedemo
{
    public static void main(String args[]) throws IOException  
    {
        FileWriter fw=new FileWriter("Friends.Txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String n;
        
        
        for(int i =0; i<=5; i++){
            System.out.println("Enter a name, total runs, and number of innings");
            n=br.readLine();
            pw.println(n);
        }
        pw.close();
        bw.close();
        fw.close();
    }
}