
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		for (int i = 1; i < 501; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " is odd");
			} else if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
		}
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2005; i < 2019; i++) {
			int a = i - 2005;
			System.out.println("In " + i + ", " + "I was " + a + " years old");
		}

		for (int i = 0; i < 3; i++) {
			for (int a = 0; a < 3; a++) {
				System.out.println(i + " " + a);
			}
		}

		for (int i = 0; i < 7; i += 3) {
			for (int a = 1; a < 4; a++) {
				System.out.print(i + a);

			}
			System.out.println();
		}

		for (int i = 0; i < 100; i += 10) {
			for (int a = 1; a < 11; a++) {
				System.out.print(i + a);

			}
			System.out.println();

		}

		for (int i = 0; i < 7; i++) {
			for (int a = i; a > 0; a--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0;i<101;i++) {
			System.out.println(100-i);
		}
	}
}
