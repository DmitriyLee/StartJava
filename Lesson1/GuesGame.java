public class GuesGame {
	public static int playerNumber = 50;//97
	public static int a = 53;//97
	public static int c = 99;//13
	public static int m = 83;//64
	public static int b = 2;//1
	public static int receivedRandomNumber() {
		b = ((a * b) + c) % m;
		return b;
		}
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
		} if (playerNumber > receivedRandomNumber()) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (playerNumber < receivedRandomNumber()) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
		}
	}

}