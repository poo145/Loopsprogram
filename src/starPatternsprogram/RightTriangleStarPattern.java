package starPatternsprogram;

import java.util.Scanner;

public class RightTriangleStarPattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern number-");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}//i  	j 	print
 //1(2)	1(2)=* (1 1)
 //2(3)	1(2)=* *(condition false come out from outer loop in s.o.p)
 //2(3) 2(3)=

 //3(4) 1(2)=* * *
 //3(4) 2(3)
 //3(4) 3(4)

//4(5)  1(2)=*