package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {
	
	public static void main(String[] args) {
 
		for (int elevnr = 1; elevnr <=10; elevnr++) { 
		String Poeng = showInputDialog("Poengsum?");
		int poeng = Integer.parseInt(Poeng);
		
		
		if (poeng >= 0 && poeng <= 39) {
			showMessageDialog(null, elevnr + "Din karakter er F");
		}
		else if (poeng >= 40 && poeng <= 49) {
			showMessageDialog(null, "Elev " + elevnr + ", din Karakter er E");
		}
		if (poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "Elev " + elevnr + ", din Karakter er D");
		}
		if (poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "Elev " + elevnr + ", din Karakter er C");
		}
		if (poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "Elev " + elevnr + ", din Karakter er B");
		}
		if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Elev " + elevnr + ", din Karakter er A");
		}
		if (poeng < 0 || poeng > 100) {
			showMessageDialog(null, "Elev " + elevnr + ", din poengsum er ugyldig, vennligst skriv en verdi mellom 0 og 100");
			elevnr--;
		}
		}
	}
}
