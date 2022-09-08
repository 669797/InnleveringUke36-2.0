package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {

	public static void main(String[] args) {
		final int TRINN1 = 190350;
		final int TRINN2 = 267900;
		final int TRINN3 = 643800;
		final int TRINN4 = 969200;
		final int TRINN5 = 2000000;

		String inntektTxt = showInputDialog("Din inntekt:");
		int inntekt = Integer.parseInt(inntektTxt);

		double trinnskatt = 0.0;

		if (inntekt >= TRINN1 && inntekt < TRINN2) {
			trinnskatt = 0.017;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= TRINN2 && inntekt < TRINN3) {
			trinnskatt = 0.04;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= TRINN3 && inntekt < TRINN4) {
			trinnskatt = 0.134;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= TRINN4 && inntekt < TRINN5) {
			trinnskatt = 0.164;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= TRINN5) {
			trinnskatt = 0.174;
			trinnskatt = inntekt * trinnskatt;
		}

		showMessageDialog(null, "Skatt: " + trinnskatt + " kr. Netto inntekt: " + (inntekt - trinnskatt) + " kr");

	}

}
