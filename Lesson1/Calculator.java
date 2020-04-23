public class Calculator {
	public static void main(String[] args) {
		int a = 20;
		int b = 5;
		char sign = '^';//(+, -, *, /, ^, %)

		if (sign == '+') {// сложение
			// int sum = a + b;
			System.out.println(a + b);
		} else if (sign == '-') {//вычитание
			// int minus = a - b;
			System.out.println(a - b);
		} else if (sign == '*') {//умножение
			// int multiply = a * b;
			System.out.println(a * b);
		} else if (sign == '/') {//деление
			// int multiply = a / b;
			System.out.println(a / b);
		} else if (sign == '%') {//деление по модулю
			// int moduldivision = a % b;
			System.out.println(a % b);
		} else if (sign == '^') {//Возведение в степень
			int result = 1;
			int counter = 0;
			while (counter < b) {
				result *= a;
				counter++;
				}
				System.out.println(result);
		}
	}
}