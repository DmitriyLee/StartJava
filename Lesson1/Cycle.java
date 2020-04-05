public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println("It's right! - " + i);
		}

		int i = 6;
		while (i >= -6) {
			System.out.println(i + " - Yeah!");
			i -= 2;
		}

		int counter = 0;
		int result = 10;
		do {
			result = result + counter;
			if(result % 2 == 0) {
				System.out.println("Число " + result + " являеться чётным");
			} else {
				System.out.println("Число " + result + " являеться нечётным");
			}
			counter++;
		} while(counter < 4);
		System.out.println ("11 + 2 = 13");
	}
}