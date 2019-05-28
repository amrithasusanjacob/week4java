
public class stringsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String examples:
				/// --------------------
				// 1. Create a string
				String name = "peter sigurdson";
				System.out.println(name);
				
				// 2. Number of characters in the string
				int numChars = name.length();
				System.out.println("Number of characters: " + numChars);
				
				// 3. Get a specific character
				char charAtPosition4 = name.charAt(4);
				System.out.println("Char at Pos 4: " + charAtPosition4);
				
				// 4. Get a substring
				String sub = name.substring(0,5);
				System.out.println("Get substring "+sub);
				String sub2 = name.substring(7);
				System.out.println("Get substring "+sub2);
				// 5. Check if one string is equal to another
				// 6. Make everything uppercase
				// 7. Make everything lowercase
	}

}
