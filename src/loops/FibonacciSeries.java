package loops;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String args[])
	{
		int f1=0,f2=1,f3=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("fibonacci series is:");
		System.out.println(+f1);
		System.out.println(+f2);
		while(c<(n-2))
		{
			f3=f1+f2;
			System.out.println(+f3);
			f1=f2;
			f2=f3;
			c=c+1;
		}
	}
}
