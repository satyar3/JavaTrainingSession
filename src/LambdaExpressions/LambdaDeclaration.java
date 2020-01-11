package LambdaExpressions;

public class LambdaDeclaration
{

	public static void main(String[] args)
	{
		//Using Anonymous inner class
		WebPage page1 = new WebPage()
		{
			
			@Override
			public void header(String headerValue)
			{
				System.out.println("Hi " + headerValue);
			}
		};
		
		WebPage page2 = new WebPage()
		{
			
			@Override
			public void header(String headerValue)
			{
				System.out.println("Hi " + headerValue);
			}
		};
	
		page1.header("Google");
		page2.header("Facebook");
		
		
		//Using Lambda expression
		WebPage page3 = (String headerValue) -> {
				System.out.println("Hi " + headerValue);
		};
		
		page3.header("Amazon");
		
		//Using Lambda expression
		WebPage page4 = (headerValue) -> {
			System.out.println("Hi " + headerValue);
		};

		page4.header("Flipkart");
		
		//Using Lambda expression
		WebPage page5 = (headerValue) -> System.out.println("Hi " + headerValue);

		page5.header("Yahoo");
	}
	

}
