package OOPSConceptPart1;

public class CallByValueAndCallByReference {

	int p,q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		
		obj.testSum(x, y); //call by value or pas by value as we are just passing a copy of the variable
	
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj); //call by reference i.e passing by object references
		
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a , int b)
	{
		int c = a+b;
		
		return c;
	}
	
	public void swap(CallByValueAndCallByReference t)
	{
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
