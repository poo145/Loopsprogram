package loops;

public class Nested_For
{	//nested for
	public static void main(String args[])
	{											//i	j	
		for(int i=1;i<=5;i++)					//1 1
		{										//1	2
			for(int j=1;j<=3;j++)				//1 3
			{									//2 1
				System.out.println(i+" "+ j);
			}
			System.out.println();
		}
	}
}
