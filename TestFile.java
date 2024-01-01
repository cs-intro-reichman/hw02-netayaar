public class TestFile {
    
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
 
	public static void main (String[] args) {
	boolean girl = false;
	boolean boy = false;
	Integer count = 0;
	String kids = "";
	for (int i=1; !(girl&&boy); i++){
		double random = Math.random();
		if (random<0.5) {
			boy = true;
			kids += "b ";}
		else {
			girl= true;
			kids +="g ";
		}
		count+=1;
	}
	System.out.println(kids);
	System.out.print("You made it... and you now have " + count +" children.");

	}
}



