/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	Integer families = Integer.parseInt(args[0]);
	double average = 0;
	String commonKids = "";
	Integer countTogether = 0;
	Integer countTwo = 0;
	Integer countThree = 0;
	Integer countFourOrMore = 0;
	for(int j=1; j<=families; j++){
		boolean girl = false;
		boolean boy = false;
		Integer countEachFamily = 0;
		for (int i=1; !(girl&&boy); i++){
		double random = Math.random();
		if (random<0.5) {
			boy = true;
			}
		else {
			girl= true;
		}
		countEachFamily+=1;	
	}
	if (countEachFamily==2) {
		countTwo+=1;
	} else if (countEachFamily==3) {
		countThree+=1;
	} else {countFourOrMore+=1;}
	countTogether+=countEachFamily;
	}
	average = (double)countTogether/families;
	Integer mostKidsCheck = Math.max(countTwo,Math.max(countThree,countFourOrMore));
	
	if (mostKidsCheck.equals(countTwo)) {
		commonKids = "2";
	}
	else if (mostKidsCheck.equals(countThree)) {
		commonKids = "3";
	}
	else{ commonKids = "4 or more";}
	
	System.out.println("Average: "+ average + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: "+ countTwo);
	System.out.println("Number of families with 3 childern: "+ countThree);
	System.out.println("Number of families with 4 or more children: "+ countFourOrMore);
	System.out.println("The most common common number of children is "+ commonKids);
	}}


