package WaysToCreateObject;

import java.lang.reflect.InvocationTargetException;

public class UsingInstanceMethod
{
	UsingInstanceMethod()
	{
		System.out.println("Inside UsingInstanceMethod Constructor");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		
		//Way-1
		UsingInstanceMethod.class.newInstance();
		
		//Way-2
		Class.forName("WaysToCreateObject.UsingInstanceMethod").newInstance();
		
		//Way-3
		UsingInstanceMethod.class.getConstructor().newInstance();
		
	}
}
