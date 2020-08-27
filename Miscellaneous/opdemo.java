public class opdemo{
	public static void main(String[] args){
		byte bb = -20;
    byte aa = 5;

		System.out.println(bb<<1);
		System.out.println(bb>>1);	//signed right shift
		System.out.println(bb>>>1); 	//unsigned right shift

    System.out.println(aa&bb);  //bitwise AND
    System.out.println(aa^bb);  //exclusive OR

	}
}