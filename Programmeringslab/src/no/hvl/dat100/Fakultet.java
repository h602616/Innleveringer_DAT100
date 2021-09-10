package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Fakultet {

	public static void main(String[] args) {
		
		   int n;
		   boolean nei;
		   
		    do { 
		      String tallTxt = showInputDialog("n =");
		      n = parseInt(tallTxt);
		      nei = (n < 0  || 12 < n);
		      if (nei)
		        showMessageDialog(null, "Ugyldig verdi");
		    } while (nei);
		 
		    showMessageDialog( null, n + "! = " + fakultet(n) );
		  }
		 
	  public static int fakultet(int maxTall) {
		    int nFakultet = 1;
		    for (int tall=1; tall<=maxTall; tall++)
		      nFakultet = nFakultet * tall;
		    return nFakultet;
}
}