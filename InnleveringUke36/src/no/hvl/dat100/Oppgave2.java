package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;

public class Oppgave2 {

	public static void main(String[] args) {
		final int A = 90;
		final int B = 80;
		final int C = 60;
		final int D = 50;
		final int E = 40;
		final int F = 0;

		String karakter = null;

		boolean gyldig = false;
		int poeng = 0;

		for (int i = 1; i <= 10; i++) {
			do {
				String poengTxt = showInputDialog("Poengsum " + i + ":");
				poeng = parseInt(poengTxt);

				if (poeng < 0 || poeng > 100) {
					gyldig = false;
					showMessageDialog(null, "Feil poengsum, prøv igjen");

				} else {

					gyldig = true;
				}
			} while (!gyldig);

			if (gyldig) {

				if (poeng >= F && poeng < E) {
					karakter = "F";
				}
				if (poeng >= E && poeng < D) {
					karakter = "E";
				}
				if (poeng >= D && poeng < C) {
					karakter = "D";
				}
				if (poeng >= C && poeng < B) {
					karakter = "C";
				}
				if (poeng >= B && poeng < A) {
					karakter = "B";
				}
				if (poeng >= A && poeng <= 100) {
					karakter = "A";
				}
				showMessageDialog(null, karakter);

			}

		}

	}
}
