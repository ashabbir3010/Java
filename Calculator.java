package Types;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 10;
		int result = num1 + num2;
		int result2 = num1 * num2;
		int result3 = num1 - num2;

		double num3 = 7;
		double num4 = 10;
		double result4 = num3 / num4;

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		int sum1 = sum(345, 12);
		int sum2 = subtract(345, 12);
		int sum3 = multiply(345, 12);
		double sum4 = divide(345, 12);
		System.out.println("SUM1: " + sum1);
		System.out.println("SUM2: " + sum2);
		System.out.println("SUM3: " + sum3);
		System.out.println("SUM4: " + sum4);
		System.out.println(sum(34, 64));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

}
