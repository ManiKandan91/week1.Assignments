package Week1.day1;

public class Primenum {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		int count = input / 2;
		for(int i =2; i<= count ; i++) {
			int remainder = input % i ;
			if(remainder == 0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(input + " is not a prime number");
		}else {
			System.out.println(input + " is a prime number");
		}
			

	}

}
