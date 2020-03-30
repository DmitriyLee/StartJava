public class BreakFast {
	public static void main(String[] args) {
		// накорми кота
		short fishNumber = 3;// три рыбы
		short beefNumber = 2;// два кусочка говядины
		short breakfast = 0;
		//breakfast = fishNumber + beefNumber;
		breakfast = (short) (fishNumber + beefNumber);
		System.out.println(breakfast); // завтрак чемпиона
	}
}