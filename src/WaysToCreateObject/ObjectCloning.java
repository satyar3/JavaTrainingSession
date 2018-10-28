package WaysToCreateObject;

public class ObjectCloning implements Cloneable
{

	public ObjectCloning()
	{
		System.out.println("Inside default constructor");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ObjectCloning obj = new ObjectCloning();
		ObjectCloning obj2 = (ObjectCloning) obj.clone();	//This way won't call the default constructor
	}
	
}
