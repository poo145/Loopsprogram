package starPatternsprogram;

import java.util.Scanner;

public class LeftTriangleStarPattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern number-");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print("  ");//2 space
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");//space after *
			}
		System.out.println("");
		}
	}
}

 
