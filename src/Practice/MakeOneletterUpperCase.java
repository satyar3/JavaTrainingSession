package Practice;

public class MakeOneletterUpperCase {

	public static void main(String[] args) {

		String str = "this is test";
		String desiredletter = "t";
		
		str = str.replaceAll("["+desiredletter+"]", desiredletter.toUpperCase());
		
		System.out.println(str);
	}

}
