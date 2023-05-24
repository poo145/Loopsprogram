	package loops;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Input a Number:");
			int n=sc.nextInt();
			int temp=n;
			int sum=0,q;
			while(n>0)
			{
				q=n%10;
				sum=sum*10+q;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println("It is a palindrome.");
			}
			else
			{
			System.out.println("It is not a palindrome.");
			}
			sc.close();
		}
}

			
	

