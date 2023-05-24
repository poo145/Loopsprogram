package loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args)
	{
        //create objects
		Scanner SC = new Scanner(System.in);
		System.out.print("Please enter maximum range: ");
        int maxrange=SC.nextInt();
        Random rand = new Random();
        for(int i=1;i<=10;i++)
		{
			//System.out.println(Math.random());
			System.out.println(rand.nextInt(maxrange));

		}
		
		
	}

}
