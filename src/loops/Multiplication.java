package loops;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		int a,b,c,d;
		System.out.println("Enter the range of numbers to print Multiplication table");
		Scanner in = new Scanner(System.in);
		a= in.nextInt();
		//System.out.println("Enter the numbers "+a);

		b= in.nextInt();
		//System.out.println("Enter the numbers "+b);

		for(c =a; c <= b; c++)
		{
			System.out.println("Multiplication table of "+c);
			
			for(d=1; d<=10; d++)
			{
				System.out.println(c+"*"+d+" = "+(c*d));

			}
		}
	}

}
