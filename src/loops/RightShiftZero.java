package loops;
//to shift all zeros to right side.
public class RightShiftZero {

	public static void main(String[] args) 
	{
			int a[]= {2,0,3,0,5,0,9,0,1};
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=0)
				{
					System.out.print(a[j]);
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==0)
				{
					System.out.print(a[i]);
				}
			}
			
	}

}
