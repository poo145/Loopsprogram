package starPatternsprogram;

import java.util.Scanner;

public class DiamondShapePattern 
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patteren value:-");
		int n=sc.nextInt();
		sc.close();					//i		//j	 //k space
		for(int i=1;i<=n;i++)		//1(2)	5(4)   -   -
		{							//		4(3)   -   --
			for(int j=n;j>=i;j--)   //      3(2)   -   ---	
			{						//		2(1)   -   ----
				System.out.print(" ");//    1(0)   -   -----
			}						//		false 1(2) -----*
			for(int k=1;k<=i;k++)//again come in 1st for loop	  
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}							//i		k	 print
		for(int i=1;i<=n-1;i++)		//1(2)	5(4) -*
		{							//		4(3) -* *
			for(int j=0;j<=i;j++)//		3(2) -* * *
			{						//		2(1) -* * * *
				System.out.print(" ");//	1(0) -* * * * *
									//		false false terminate
			}						//2(3) 5(4)  -*
			for(int k=n-1;k>=i;k--)	//		4(3) -* *
			{						//		3(2) -* * *
				System.out.print("* ");//	2(1) -* * * *
			}
			System.out.println(" ");
		
		}
	}
}

