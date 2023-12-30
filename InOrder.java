/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomNumber = ((int)((Math.random()*10)));
		System.out.println(randomNumber);
		int newRandomNumber = 0;
		 do {
		 	newRandomNumber = ((int)((Math.random()*10)));
			if (newRandomNumber>= randomNumber) {
				System.out.println(newRandomNumber);
				randomNumber = newRandomNumber;
			}
			else break;
		} while (randomNumber>=newRandomNumber); 
			
	}}