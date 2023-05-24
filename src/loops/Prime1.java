package loops;

import java.util.Scanner;

public class Prime1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int n=sc.nextInt();
		sc.close();
		int i,j,temp=0;
		System.out.println("prime numbers are-");
		for(i=1;i<=n;i++)
		{
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(" "+i);
			}
			else
			{
				temp=0;
			}
		}
	}
}
