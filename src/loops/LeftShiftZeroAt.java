package loops;

public class LeftShiftZeroAt {

	public static void main(String[] args) 
	{
		int a[]= {1,2,0,4,0,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)							//a[0](1)==0
			{
				System.out.print(a[i]);				//0
			}
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=0)
			{
				System.out.print(a[j]);				//1 2 4
			}
		}
	}

}
