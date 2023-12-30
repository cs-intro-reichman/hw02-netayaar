/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		for (int i = 1; i<=input; i++){
			for(int j=1; j<=input && i%2!=0 ; j++){
				System.out.print("* ");	
			}
			for (int h=1; h<=input && i%2==0; h++){
				System.out.print(" *");
			}
		System.out.println();}
		}}
	
