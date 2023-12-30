/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		String initial =  number + " is a perfect number since " + number +" = 1";
		int count = 1;
		for (int i = 2; i<number && number!=1; i++){
			if (number%i==0) {
				count+=i;
				initial += " + " + i;	
			}
		}
		if (count==number && number!=1) {
			System.out.println(initial);
		}
		else System.out.println(number+ " is not a perfect number");
	}
}
