package de.habelitz.uebung07;

/*
 * Programm Stringrueckwaerts2 gibt eine eingegebene Textzeile
 * Zeichen für Zeichen rückwärts in einem MessageDialog aus
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Stringrueckwaerts2 {
    public static void main(String args[]) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie einen Text ein: ");
	var eingabe2 = "";
	for (int i = eingabe.length() - 1; i >= 0; i--) {
	    eingabe2 = eingabe2 + eingabe.charAt(i);
	}
	JOptionPane.showMessageDialog(null, eingabe2);
    }

}
