public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 5;
		char sign = '^';

		if (sign == '+') {// сложение
			int sum = a + b;
			System.out.println(sum);
		} else if (sign == '-') {//вычитание
			int minus = a - b;
			System.out.println(minus);
		} else if (sign == '*') {//умножение
			int multiply = a * b;
			System.out.println(multiply);
		} else if (sign == '%') {//деление по модулю
			int moduldivision = a % b;
			System.out.println(moduldivision);
		} else if (sign == '^') {//побитовое исключающeе OR (или)
			int exponent = a ^ b;
			System.out.println(b);
			System.out.println("Number: " + a + " in binary notation: " + Integer.toBinaryString(a));
			System.out.println("Number: " + b + " in binary notation: " + Integer.toBinaryString(b));
			System.out.println("Number: " + exponent + " in binary notation: " + Integer.toBinaryString(exponent));
		}
	}
}