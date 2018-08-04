import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "Put it any number:");
		int num = Integer.parseInt(number);
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, "NOT PRIME!");
				System.exit(0);

			}
		}
		JOptionPane.showMessageDialog(null, "PRIME!");
	}
}
