package starPatternsprogram;

import java.util.Scanner;

public class PyramidStarpattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern number-");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++)	//outerloop
		{
			for(int j=num;j>=i;j--)//innerloop
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//innerloop
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
}
