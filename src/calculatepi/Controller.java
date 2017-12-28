package calculatepi;

public class Controller {

	public static void main(String[] args) {
		// TODO Replace with BigDecimal?
		double pi = 1;
		boolean flag = false;
		long startTime = System.currentTimeMillis();
		for (double i = 3; i < 1000000000; i += 2) {
			if (flag) {
				pi += (1 / i);
				flag = false;
			} else {
				pi -= (1 / i);
				flag = true;
			}
		}
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(pi * 4);
		System.out.println("Calculated in " + duration + " milliseconds.");
	}
}
