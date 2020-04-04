public class Cycle {
	public static void main(String[] args) {
		for (int isFor = 0; isFor <= 20; isFor++) {
			System.out.println("It's right! - " + isFor);
		}
		int isWhile = 6;
		while (isWhile >= -6) {
			System.out.println(isWhile + " - Yeah!");
			isWhile = isWhile - 2;
		}
		int isDoWhile = 0;
		int result = 10;
		do {
			result = result + isDoWhile;
			if(result % 2 == 0) {
				System.out.println("Число " + result + " являеться чётным");
			} else {
				System.out.println("Число " + result + " являеться нечётным");
			}
			isDoWhile++;
		} while(isDoWhile <= 4);
		System.out.println ("10 + 1 + 2 + 3 + 4  = " + result);
	}
}