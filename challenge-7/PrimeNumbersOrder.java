import java.util.*;

public class PrimeNumbersOrder {

	public static boolean isPrime(int num) {
		for(int i=2; i<=num; i++){
			if(num % i == 0 && num != i){
				return false;
			}
		}

		return true;
	}

	public static int findPrimeNumAt(int index) {
		int num = 2;
		for(int i=1; i<=index; i++) {
			if(isPrime(num)) {
				System.out.println("Prime: " + num + "  (Index: " + i + ")");
				if(i != index) {
					num++;
				}
			} else {
				System.out.println("Not Prime: " + num);
				num++;
				i--;
			}
		}

		return num;
	}

	public static void requestPrimeNumber() {
		Scanner input = new Scanner(System.in);
		int num = 0;

		System.out.println("Which prime number would you like to know? For example, 1 " 
							+ "for 1st prime number (which is 2) and 6 for 6th prime number " 
							+ "(which is 13)");

		try {
			num = input.nextInt();
		} catch(java.util.InputMismatchException error) {
			System.out.println("\nPlease type a valid number.\n");
			requestPrimeNumber();
		}

		if(num > 3) {
			System.out.println("\n\n" + num + "th prime number: " + findPrimeNumAt(num) + "\n");
		} else if(num == 1) {
			System.out.println("\n\n" + num + "st prime number: " + findPrimeNumAt(num) + "\n");
		} else if(num == 2) {
			System.out.println("\n\n" + num + "nd prime number: " + findPrimeNumAt(num) + "\n");
		} else if(num == 3) {
			System.out.println("\n\n" + num + "rd prime number: " + findPrimeNumAt(num) + "\n");
		} else {
			System.out.println("\nPlease type a valid number.\n");
			requestPrimeNumber();
		}
	}

	public static void main(String args[]) {
		requestPrimeNumber();
	}

}