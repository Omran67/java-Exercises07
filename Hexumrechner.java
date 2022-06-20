package de.habelitz.uebung07;

/*
 * Programm Hexumrechner zur Umrechnung einer Hexadezimalzahl
 * in das Dezimal- und das Dualsystem.
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Hexumrechner {
    public static void main(String args[]) {
	var e = JOptionPane
		.showInputDialog("Geben Sie eine Hexadezimalzahl ein: ");
	JOptionPane.showMessageDialog(null, "Hexadezimalzahl: " + e + "\n"
		+ "Dezimalzahl: " + Long.valueOf(e, 16) + "\n" + "Dualzahl: "
		+ Long.toBinaryString(Long.valueOf(e, 16)));
    }
}
