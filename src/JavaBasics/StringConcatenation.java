package JavaBasics;

public class StringConcatenation {
	public static void main(String...args){
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "world";
		
		double c = 12.33;
		double d= 10.33;
		
		//+ sign is concatenation operator
		
		System.out.println(a+b);
		System.out.println(x+" "+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
	}

}
