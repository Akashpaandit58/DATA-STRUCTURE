package Recursion;

public class Checkpallibndrom {
	public static void main(String[] args) {
		String s="121";
		String d=check(s);
		
		
	}

	private static String check(char c) {
		if(c==null)
			return c;
		return check(c.charAt(c.length()-1));
			
	}

}
