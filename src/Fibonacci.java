
public class Fibonacci {
	public static void main(String[] args) {
		int secondLast = 0;
		int last = 1;
		System.out.println(secondLast);

		for (int i = 0; i < 11; i++) {
			int num = secondLast + last;
			System.out.println(num);
			secondLast = last;
			last = num;
		}
	}
}
