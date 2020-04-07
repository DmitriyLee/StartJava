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

		int counter = 9;
		int result = 10;
		do{
			result = result + counter;
			counter += 2;
			System.out.println(counter + " - neChet");
		}while(counter<19);
		System.out.println("11 + 13 + 15 + 17 + 19 = " + result);
	}
}