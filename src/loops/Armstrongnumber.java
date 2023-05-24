package loops;

import java.util.Scanner;

public class Armstrongnumber
{
	public static void main(String args[])
	{
		System.out.println("Enter 3 digit number:-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int number,temp,total=0;
		number=n;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number/=10;
		}
		if(total==n)
		{
			System.out.println(n + " is an Armstrong number");
		}
		else
		{
			System.out.println(n + " is not an Armstrong number");
		}
	}

}
