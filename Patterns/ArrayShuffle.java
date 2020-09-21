import java.util.*;
public class ArrayShuffle{
    int[] arr = new int[10];
    String[] a  = {"ey", "ey", "ey", "harry", "ey", "ey", "ey", "ey", "ey", "ey"};
    String word = "HarryPotte";
    public static void main(){
        Scanner sc = new Scanner(System.in);
        ArrayShuffle obj = new ArrayShuffle();
       
        System.out.println("Enter 1 for admin and 2 for player");
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println("Repeat?");
            int l = sc.nextInt();
            for(int p=0; p<l; p++){
                System.out.println("Enter 1 to add word and 2 to delete word");
                ch = sc.nextInt();
                switch(ch){
                    case 1: 
                        System.out.println("Repeat addition?");
                        int n = sc.nextInt();
                        for(int i =0; i<n; i++){
                            System.out.println("Enter word and index");     
                            String insert = sc.next();
                            int index = sc.nextInt();
                            obj.addWord(index, insert);
                        }
                        break; 
                    case 2: 
                        System.out.println("Repeat deletion?");
                        int m = sc.nextInt();
                        for(int i =0; i<m; i++){
                            System.out.println("Enter word to delete");     
                            String del = sc.next();
                            if(obj.getWord(del)>-1)obj.deleteWord(del);
                        }
                        break;
                    default: System.out.println(""); 
                }
                
                for(int q = 0; q<obj.a.length; q++)System.out.println(obj.a[q]);
                
                
                System.out.println("/n/n/n/n/n/n/n/n/n/n Still want to play? Hit 1 for yes.");
                if(sc.nextInt()==1)ch=2;
                else ch=0;
            }
        }
        if(ch==2){
            System.out.println("Enter 1 to register, 2 to play, and 3 to see top 5 scores");
            ch = sc.nextInt();
            switch(ch){
                case 1: break;
                case 2: obj.play(); break;
                case 3: break;
                default: break;
            }
        }
    }
    
    public boolean legitCheck(String s){
        if(getWord(s)==-1)return false;
        return true;
    }
    
    String jumbledWord(){
        String jumble="";
        for (int i=0;i<a.length;i++)
        {
            jumble += word.charAt(arr[i]);
        }
        return jumble;
    }
    
    public void play(){
        Scanner sc = new Scanner(System.in);
        int right = 0;
        int points = 0;
        generateUniqueNumber(10);
        System.out.println("The jumbled word is " + jumbledWord());
        System.out.println("What do you think the actual word is?");
        String ans = sc.next();
        if(ans.equals(word))System.out.println(encouragingMessage());
        else System.out.println(discouragingMessage());
        for(int i=1; i<=3; i++){
            System.out.println("Attempt " + i);
            String a= sc.next();
            if(legitCheck(a)){
                switch(i){
                    case 1: right++; points+=3; break;
                    case 2: right++; points+=2; break;
                    case 3: right++; points+=1; break;
                }
                System.out.println(encouragingMessage());
            }
            else System.out.println(discouragingMessage());
        } if(right==3)points+=5;
        
        System.out.println("\n\n\n\n\nYou got " + right + " questions right!");
        System.out.println("You got " + points + " points!");
        
    }
    
    public void addWord (int index, String s)
    {
        a[index] = s;
    }
    
    public int getWord (String s){
        int i;
        for (i = 0; i<a.length; i++){
            if (a[i].equalsIgnoreCase(s)==true)
                return i;
        }
        return -1;
    }
    
    public void deleteWord(String s){
        int index = getWord(s);
        for (int i = index; i<a.length-1; i++)
        {
            a[i] = a[i+1];
        }
        a[a.length-1] = "buffy";
    }
    
    public String discouragingMessage(){
        String[] a = {"Very Close", "Just missed", "Try again", "Think again", "Can do better"};
        int i = (int)(Math.random()*a.length);
        return a[i];
    }
    
    public String encouragingMessage(){
        String[] a = {"Wow", "Amazing", "Excellent!", "Hero", "Good work"};
        int i = (int)(Math.random()* a.length);
        return a[i];
    }
    public void generateUniqueNumber(int len){
        for(int i = 0; i<len; i++){
            int rand = (int)(Math.random()*len);
            arr[i]=rand;
            boolean flag = false;
            do{
                flag = false;
                rand = (int)(Math.random()*len);
                for(int j=0; j<i; j++){
                    if(arr[j]==rand)flag =true;
                }
            }
            while(flag);
            arr[i] = rand;
            System.out.println(a[i]);
        }
    }
}