package loops;
public class ShiftZeroAtright 
{
	public static void main(String args[])
	{
		int a[]= {1,6,8,0,5,0,4,8,0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]);
				
			}
		}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==0)
				{
					System.out.print(a[j]);
					
				}
			}
		}
}				//o/p=>								//print
//i=0;i<9;i=(1)true=>if a[0]!=0 (a[0]=1!=0 true print 1 terminate
//i=1;1<9;i=(2)true=>a[1]!=0 (a[1]=6!=0)true print  6	terminate
//i=2;2<9;i=(3)true=>a[2]!=0 (a[2]=8!=0)true print  8	terminate
//i=3;3<9;i=(4)true=>a[3]!=0 (a[3]=0=0)false whole i loop execute first then checking for j loop conditions.