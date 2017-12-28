package calculatepi;

public class Controller {

	public static void main(String[] args) {
		//TODO Replace with BigDecimal?
		double pi = 1;
		boolean flag = false;
		for(double i = 3; i < 1000000000; i+=2) {
			if(flag) {
				pi+=(1/i);
				flag = false;
			} else {
				pi-=(1/i);
				flag = true;
			}
		}
		System.out.println(pi*4);
	}
}
