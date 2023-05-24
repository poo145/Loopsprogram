package loops;

public class ConcateString {
	String s1="Apple";
	String s2="Red";
	String s3="Sweet";
	public void concat()
	{
		System.out.println(s1+s2+s3);
	}
	public static void main(String[] args) 
	{
		ConcateString c=new ConcateString();
		c.concat();
	}

}
