package starPatternsprogram;

import java.util.Scanner;

public class RightDownMirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern number-");
		int num=sc.nextInt();
		sc.close();
		for(int i=num;i>=1;i--)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
