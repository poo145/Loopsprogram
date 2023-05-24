package loops;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String s="poonam";
		//System.out.println(s.length());
		char chars[]=s.toCharArray();
		System.out.print("Reverse String is : ");
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}
	}
}
