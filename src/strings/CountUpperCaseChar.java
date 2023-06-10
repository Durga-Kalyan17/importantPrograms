package strings;

public class CountUpperCaseChar {

	public static void main(String[] args) {
		
		String name = "arjun";
		
		for(int i = 0; i < name.length(); i++) {
			System.out.print((char) ((int) name.charAt(i) - 32));
		}

	}

}
