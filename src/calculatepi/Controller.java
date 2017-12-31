package calculatepi;

public class Controller {

	public static void main(String[] args) {
		int digits = 100;
		String pi = "";
		int[] arr = new int[digits + 1];
		int carry = 0;
		long startTime = System.nanoTime();
		// Initializes the array with a value of 2000
		for (int i = 0; i <= digits; ++i) {
			arr[i] = 2000;
		}

		for (int i = digits; i > 0; i -= 14) {
			int sum = 0;
			for (int j = i; j > 0; --j) {
				sum = sum * j + 10000 * arr[j];
				arr[j] = sum % (j * 2 - 1);
				sum = sum / (j * 2 - 1);
			}
			pi = pi + (carry + sum / 10000);
			carry = sum % 10000;
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Calculated in " + duration + " nanoseconds.");
		// Puts a decimal point into the generated string
		pi = pi.substring(0, 1) + "." + pi.substring(1);
		System.out.println(pi);
	}
}
