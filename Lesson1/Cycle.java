public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Number - " + i);
		}

		int i = 6;
		while (i >= -6) {
			System.out.println(i + " - Yeah!");
			i -= 2;
		}

		int counter = 11;
		int result = 0;
		do {
			result = result + counter;
			System.out.println(counter + " - Odd number");
			counter += 2;
		} while(counter <= 20);
		System.out.println("11 + 13 + 15 + 17 + 19 = " + result);
	}
}