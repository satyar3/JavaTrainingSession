package Practice;

public class StringPalindromPair
{
	public static void main(String[] args)
	{

		String s = "kmjitinit";
		int startIdx = 0;
		int endIdx = 0;
		boolean flag = true;
		int count = 0;
		//System.out.println("satya".substring(0, 5)+" "+"satya".length());
		
		for(int i = 0; i<s.length(); i++)
		{
			flag = true;			
			for(int j = i+1; j<s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					flag = true;
					count++;
					startIdx = i+1;
					endIdx = j-1;					
										
					while(startIdx<endIdx)
					{
						if(s.charAt(startIdx) == s.charAt(endIdx))
						{
							startIdx = startIdx+1;
							endIdx = endIdx-1;
							//count++;
						}
						else
						{
							flag = false;
							count--;
							break;
						}
					}
					
					if(flag == true)
					{
						System.out.println("Matching pair number "+count +" is : "+s.substring(i,j+1));
						//System.out.println("New String is : "+s.substring(0,i)+" "+s.substring(i,j+1)+" "+s.substring(j,s.length()));
					}
				}
				else
					flag = false;				
				
					
			}
			if(flag == false)
			{
				//System.out.println(s.charAt(i)+" doesn't have a matching pair ! Moving to next !");
			}
		}
	}
}
