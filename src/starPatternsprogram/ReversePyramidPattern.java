package starPatternsprogram;

import java.util.Scanner;

public class ReversePyramidPattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern number-");
		int n=sc.nextInt();
		sc.close();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
