public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 34;
		if (age >= 20) {
			System.out.println("Верно! Мне больше 20 лет.");
		}

		boolean male = true;
		if (male) {
			System.out.println("Да! Я мужчина!");
		}
		boolean isMale = false;
		if (isMale) {
			System.out.println("НЕ верно! Я женщина.");
		}

		float height = 1.70f;
		if (height <= 1.80) {
			System.out.println("Верно, рост ниже 1.80.");
		} else {
			System.out.println("Нет, рост выше 1.80.");
		}

		char firstLetterName = 'D';
		if (firstLetterName == 'M') {
			System.out.println("Да, верно!");
		} else if (firstLetterName == 'I') {
			System.out.println("Да, верно!");
		} else {
			System.out.println("Ни один из указанных вариантов!");
		}
	}
}