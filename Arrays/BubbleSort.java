public class BubbleSort{
    public static void main(String[] args){
        int[] a  = {1,24,65,5,56,6,5,7,14,5,23,2};
        int temp;
        for(int i = 0; i<a.length; i++){
          
            for(int j = 0; j<a.length - i - 1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            for(int k = 0; k<a.length; k++)
              System.out.print(a[k]+ " ");
              System.out.println();             
            }
        }       
    }
}