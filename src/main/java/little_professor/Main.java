package little_professor;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int lvl =0;
		while (lvl != 99) {
			lvl = Play.getLevel();
			switch (lvl) {
			case 0:
				levelZero();
				break;
			case 1:
				levelOne();
				break;
			case 2:
				levelTwo();
				break;
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
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			}

		}
		Play.showGrade(grade);
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
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i > 3) {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
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
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i > 3) {
				System.out.printf("%d/%d=", a, b);
				double ans = input.nextInt();
				double expected = Calculate.divide(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			}
		}
		Play.showGrade(grade);
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
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i == 2) {
				System.out.printf("%d-%d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.sub(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i == 3) {
				System.out.printf("%d x %d=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.multiply(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else
					Play.showMessage(2);
			} else if (i == 4) {
				System.out.printf("%d(%d X %d))=", b, a, a);
				int ans = input.nextInt();
				int expected = Calculate.power(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i == 5) {
				System.out.printf("how many times you need do this: %d - %d until %d<=%d =", a, b, a, b);
				int ans = input.nextInt();
				int expected = Calculate.div(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i >= 6 && i <= 8) {
				System.out.printf("%d / %d=", a, b);
				double ans = input.nextInt();
				double expected = Calculate.divide(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			} else if (i > 8) {
				System.out.printf("%d % %d)=", a, b);
				int ans = input.nextInt();
				int expected = Calculate.power(a, b);

				if (ans == expected) {
					Play.showMessage(1);
					grade++;
				} else {
					Play.showMessage(2);
				}
			}
		}
		Play.showGrade(grade);
	}
}
