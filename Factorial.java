package Week1.day1;

public class Factorial {

	public static void main(String[] args) {
		//Factorial of 6
		int number = 6;
		int factorial = 1;
		
		// 1 * 2 * 3 * 4 * 5 * 6
		for(int i =1; i <= number ; i++) {
			factorial = i * factorial;
		}
		System.out.println("Factorial of " + number + " is " + factorial);
	}

}
