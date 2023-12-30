import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats { 
		
	public static void main (String[] args) {
		int families = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		double rnd = generator.nextDouble();
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
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	

