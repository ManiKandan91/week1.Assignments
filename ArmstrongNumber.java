package Week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int calculated = 0;
		int remainder;
		int original;
		original = input;
		while (input > 0) {
			remainder = input%10;
			input = input/10;
			calculated += remainder * remainder * remainder;
		}
		if (calculated == original) {
			System.out.println("The Input Number is an  Armstrong");
		}else {
			System.out.println("The Input Number is not an Armstrong");
		}
		
	}

}
