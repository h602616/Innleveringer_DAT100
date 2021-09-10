package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Trinnskatt {
	

		public static void main(String[] args) {
	
			double trinn1 = 0.0093;
			double trinn2 = 0.0241;
			double trinn3 = 0.1152;
			double trinn4 = 0.1452;
			
String Inntekt = showInputDialog("Din inntekt");
			
			int inntekt = Integer.parseInt(Inntekt);

if (inntekt <= 164000) {
	showMessageDialog(null, "Du er under trinn 1, du betaler 0 kr");
}
	else if (inntekt >= 164001 && inntekt <= 230950) {
		showMessageDialog(null, "Du er på trinn 1, du betaler " + (inntekt*trinn1) + "kr");
	}
	else if (inntekt >= 230951 && inntekt <= 580650) {
		showMessageDialog(null, "Du er på trinn 2, du betaler " + (inntekt * trinn2) + "kr");
	}
	else if (inntekt >= 580651 && inntekt <= 934050) {
		showMessageDialog(null, "Du er på trinnnivå 3, du betaler " + (inntekt*trinn3) + "kr");
	}
	else if (inntekt >= 934051) {
		showMessageDialog(null, "Du er på trinnnivå 4, du betaler " + (inntekt*trinn4) + "kr");
	 }
	}


}