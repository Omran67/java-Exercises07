package de.habelitz.uebung07;

/*
 * Programm Zahlensysteme zur Umwandlung einer Dezimalzahl
 * in das Dual- und in das Hexadezimalsystem.
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Zahlensysteme {
    public static void main(String args[]) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl ein: ");
	var z = Integer.parseInt(eingabe);
	JOptionPane.showMessageDialog(null, "Dezimal: " + z + "\n" + "Dual: "
		+ Integer.toBinaryString(z) + "\n" + "Hexadezimal: "
		+ Integer.toHexString(z).toUpperCase());
    }
}
