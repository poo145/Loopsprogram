package loops;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String args[])
	{
		System.out.println("Enter a Year :");
		Scanner s=new Scanner(System.in);	//to call input from user
		int number=s.nextInt();
		if(number%4==0)
		{
			System.out.println("This is Leap Year..");
		}
		else
		{
			System.out.println("This is not Leap Year.");
		}
		s.close();
	}
}


