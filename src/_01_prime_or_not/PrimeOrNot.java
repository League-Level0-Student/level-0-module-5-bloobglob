package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean divisible = false;
		String num = JOptionPane.showInputDialog("What number do you want?");
		int number = Integer.parseInt(num);
		for(int i = 2; i<number;i++) {
			if(number%i==0) {
				divisible = true;
				JOptionPane.showMessageDialog(null, number + " is not prime, it is divisible by " + i);
				break;
			}
		}
		if(!divisible) {
			JOptionPane.showMessageDialog(null, number+" is prime.");
		}
	}
}
