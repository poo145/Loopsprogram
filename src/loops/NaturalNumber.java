package loops;

import java.util.Scanner;

public class NaturalNumber
{
	public static void main(String aegs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Range:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Naturals numbers are:");
		int i=1;
		while(i<=n)
		{
			System.out.println(+i);
			i++;
			
		}
		
	}
}
