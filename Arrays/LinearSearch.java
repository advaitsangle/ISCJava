public class LinearSearch{
    public static void main(){
        int[] a = {1, 2, 3, 4, 6,4 ,1, 5, 6,6, 7,7,8,8 ,1 ,7, 6, 8, 1};
        int search = 9, flag=0;
        for(int i = 0; i<a.length; i++)
            if(a[i]== search){
                System.out.println("Element found at "+ (i+1)); flag = 1; break;}
        if (flag ==0)
            System.out.println("Element not found");
    }
}