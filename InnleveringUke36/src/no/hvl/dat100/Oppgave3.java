package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class Oppgave3 {

	public static void main(String[] args) {
		String nTxt = showInputDialog("Heltall");
		int n = parseInt(nTxt);

		int input = n;
		int output = 1;

		if (n < 0) {
			System.out.println("Ugyldig");
		} else {

			while (n > 1) {
				output = output * n;
				n--;
			}
			System.out.println(input + "! = " + output);
		}

	}

}
