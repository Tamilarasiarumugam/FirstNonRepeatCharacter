package Practice;

public class FisNonRepeatedChar {
	
	public static char nonRepeat(String s)
	{
		//Character c=null;
		
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag++;
					break;
				}
				
				
			}
			if(flag==0)
			{
				return s.charAt(i);
				
			}
		}
		return '$';
		
			
	}
	
	public static void main(String[] args)
	{
		String s="geeksforgeeks";
		//String s="racecar";
		System.out.println(nonRepeat(s));
	}

}
