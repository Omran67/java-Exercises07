package de.habelitz.uebung07;

/*
 * Programm Stringrueckwaerts3 verwendet f?r die R?ckw?rtsausgabe
 * einmal den Typ String und einmal den Type StringBuffer.
 * Zum Performance-Vergleich wird die jeweils ben?tigte Zeit ausgegeben
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Stringrueckwaerts3 {
    public static void main(String args[]) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie einen Text ein: ");
	var eingabe2 = new StringBuffer("");
	long zstVorher;
	long zstNachher;

	zstVorher = System.currentTimeMillis();

	for (int i = eingabe.length() - 1; i >= 0; i--) {
	    eingabe2.append(eingabe.charAt(i));
	}

	zstNachher = System.currentTimeMillis();
	JOptionPane.showMessageDialog(null, eingabe2);
	System.out.println("Ben?tigte Zeit mit StringBuffer: "
		+ ((zstNachher - zstVorher)) + " Millisekunden");
	String eingabe3 = "";
	zstVorher = System.currentTimeMillis();
	for (int i = eingabe.length() - 1; i >= 0; i--) {
	    eingabe3 = eingabe3 + eingabe.charAt(i);
	}
	zstNachher = System.currentTimeMillis();
	System.out.println("Ben?tigte Zeit mit String: "
		+ ((zstNachher - zstVorher)) + " Millisekunden");
    }
}
