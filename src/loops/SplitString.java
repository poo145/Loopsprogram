package loops;

public class SplitString {

	public static void main(String[] args) 
	{
			String s1="This is java string split method";
			String[] words=s1.split("\\s");//splits the string based on whitespace
			//using java foreach loop to print elements of string array
			for(String w:words)
			{
			System.out.println(w);
			}
	}
}
	

