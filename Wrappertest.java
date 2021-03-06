package de.habelitz.uebung07;

/*
 * Programm Wrappertest zur Demonstration des Umgangs
 * mit den Wrapper-Klassen
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Wrappertest {
    public static void main(String[] args) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl ein: ");
	Integer i = Integer.valueOf(eingabe);
	System.out.println("Eingegebene Zahl: " + i);
	System.out.println("als Dualzahl: " + Integer.toBinaryString(i));
	System.out.println("als Oktalzahl: " + Integer.toOctalString(i));
	System.out.println("als Hexzahl: " + Integer.toHexString(i));
	System.out.println("Obergrenze von int: " + Integer.MAX_VALUE);
	System.out.println("Untergrenze von int: " + Integer.MIN_VALUE);
	eingabe = JOptionPane.showInputDialog("Geben Sie eine Kommazahl ein: ");
	double d = Double.parseDouble(eingabe);
	System.out.println(i + "/" + d + "=" + (i / d));
	System.out.println(i.intValue() + "/" + d + "=" + (i.intValue() / d)); // unn?tig
									       // kompliziert
	Double wd = Double.valueOf(0.0);
	System.out.println(d + "/" + wd + "=" + d / wd);
	Double wd2 = 2.5; // Ausnutzen von Autoboxing
	System.out.println(-wd2 + "/" + 0 + "=" + -wd2 / 0);
	System.out.println(0.0 + "/" + 0.0 + "=" + 0.0 / 0.0);
    }
}
