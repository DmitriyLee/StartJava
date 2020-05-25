public class GuessGame {
	private static int compNum = 17;
	private static int a = 1;
	private static int c = 99;
	private static int m = 100;
	private static int playerNum = 13;

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (compNum > numberRandomPlayer()) {
				System.out.print(compNum + " " + ">" + " " + numberRandomPlayer());
				System.out.println(" = " + "Введенное вами число меньше того, что загадал компьютер");
			} else if (compNum < numberRandomPlayer()) {
				System.out.print(compNum + " " + "<" + " " + numberRandomPlayer());
				System.out.println(" = " + "Введенное вами число больше того, что загадал компьютер");
			} else {
				System.out.print(compNum);
				System.out.println(" = " + "Вы угадали!");
				break;
			}
		}
	}

	private static int numberRandomPlayer() {
		playerNum = ((a * playerNum) + c) % m;
		return playerNum;
	}
}