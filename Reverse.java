/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		// gets string from user and reverses it and then prints
		String mystring = args[0];
		String newString = "";
		for (int i =mystring.length()-1; i>=0; i--){
			 newString = newString+mystring.charAt(i);
		}
		System.out.println(newString);
		int middleIndex = mystring.length() /2;
		System.out.println("The middle character is " + mystring.charAt(middleIndex));
	}
}
