public class CharDemo {
	public static void main (String [] args) {
		
		char initial='A';
		System.out.println(initial);
		System.out.println("\t\"abc\\def\bghi\n\njkl");
		// def - followed by a backspace escape sequence (\b), so the f is overridden by ghi.
		
	}
	
}