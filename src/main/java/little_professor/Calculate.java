package little_professor;

public class Calculate {
	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int power(int x, int y) {
		int t = x;
		for (int i = 1; i < y; i++) {
			x = x * t;
		}
		return x;
	}

	public static int div(int x, int y) {
		int div = 0;

		while (x >= y) {
			div++;
			x -= y;
		}

		return div;
	}

	public static double divide(int x, int y) {
		return x / y;
	}

	public static int mod(int x, int y) {
		return x % y;
	}
}
