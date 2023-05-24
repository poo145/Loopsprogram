package starPatternsprogram;

import java.util.Scanner;

public class DownwordTriangleStarPattern 
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
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
