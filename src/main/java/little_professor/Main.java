package little_professor;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int lvl = Play.getLevel();
		while (lvl != 99) {
			switch (lvl) {
			case 0:
				levelZero();
			case 1:
				levelOne();
			}
		}
	}

	static void levelZero() {
		int grade = 0;
		for (int i = 1; i < 11; i++) {
			int a = Play.getNum(1);
			int b = Play.getNum(0);
			if (i <= 5) {
				System.out.printf("%d+%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.add(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i > 5) {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			}
			System.out.println("the grade:" + grade);

		}
	}

	static void levelOne() {
		int grade = 0;
		for (int i = 1; i < 6; i++) {
			int a = Play.getNum(4);
			int b = Play.getNum(4);
			if (i <= 3) {
				System.out.printf("%d+%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.add(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i > 3) {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			}
		}
		for (int i = 1; i < 6; i++) {
			int a = Play.getNum(1);
			int b = Play.getNum(0);
			if (i <= 3) {
				System.out.printf("%d x %d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.multiply(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i > 3) {
				System.out.printf("%d/%d=", a, b);
				double ans = input.nextInt();
				double expected = Calculate.divide(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			}
		}
		System.out.println("the grade:" + grade);
	}

	static void levelTwo() {
		int grade = 0;
		for (int i = 1; i < 11; i++) {
			int a = Play.getNum(4);
			int b = Play.getNum(4);

			if (i == 1) {
				System.out.printf("%d+%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.add(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i == 2) {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i == 3) {
				System.out.printf("%d x %d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.multiply(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else
					System.out.println("Wrong: the answer is: " + expected);
			} else if (i == 4) {
				System.out.printf("%d(%d%d))=", b, a, a);
				int ans = input.nextInt();
				int expected = Calculate.power(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i == 5) {
				System.out.printf("%d - %d until %d<=%d =", a, b, a, b);
				int ans = input.nextInt();
				int expected = Calculate.div(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i >= 6 && i <= 8) {
				System.out.printf("%d / %d=", a, b);
				double ans = input.nextInt();
				double expected = Calculate.divide(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			} else if (i > 8) {
				System.out.printf("%d % %d)=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.power(a, b);

				if (ans == expected) {
					System.out.println("Congrats");
					grade = grade + 10;
				} else {
					System.out.println("Wrong: the answer is: " + expected);
				}
			}
		}
		System.out.println("the grade:" + grade);
	}
}
