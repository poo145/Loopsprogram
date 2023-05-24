package loops;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer value:-");
		int num=sc.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			sc.close();
		}
		System.out.println("Factorial of "+num+ " is:"+fact);
	}
	
}
