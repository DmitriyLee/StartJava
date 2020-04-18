public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 5;
		char sign = '^';

		if (sign == '+') {// сложение
			int sum = a + b;
			System.out.println(sum);
		}

		else if (sign == '-') {//вычитание
			int minus = a - b;
			System.out.println(minus);
		}

		else if (sign == '*') {//умножение
			int multiply = a * b;
			System.out.println(multiply);
		}

		else if (sign == '%') {//деление по модулю
			int moduldivision = a % b;
			System.out.println(moduldivision);
		}

		else if (sign == '^') {//возведение в степень
			int exponent = a ^ b;
			System.out.println(exponent);
		}
	}
}