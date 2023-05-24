package loops;

public class Swap2Noswithout3variable {

	public static void main(String[] args)
	{
		int x=100;
		int y=55;
		System.out.println("Before swapping :");
		System.out.println("x is :"+x);
		System.out.println("y is :"+y);
		x=x+y;	//20+10=30
		y=x-y;	//30-10=20
		x=x-y;	//30-20=10
		System.out.println("After swapping :");
		System.out.println("x is :"+x);
		System.out.println("y is :"+y);
	}

}
