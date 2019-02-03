package Practice;

public class CallByValAndCallByRef {
	
	int a;
	int b;
	
	void calledByValue(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	
	void calledByRef(CallByValAndCallByRef o)
	{
		this.a = o.a;
		this.b = o.b;
		
		System.out.println(this.a+" "+this.b);
	}
	
	public static void main(String...args)
	{
		CallByValAndCallByRef cbvr = new CallByValAndCallByRef();
		cbvr.calledByValue(2, 3);	//Call By Value
		cbvr.calledByRef(cbvr);		//Call By Reference
	}
}
