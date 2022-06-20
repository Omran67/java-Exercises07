package de.habelitz.uebung07;

/*
 * Programm Vokaltest2 zur Demonstartion des Zugriffs
 * auf einzelne Zeichen innerhalb eines Strings
 * als Erweiterung von Vokaltest
 * um die Berücksichtigung von Großbuchstaben
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Vokalzaehler2 {
    public static void main(String[] args) {
	int aZaehler = 0, eZaehler = 0, iZaehler = 0, oZaehler = 0, uZaehler = 0;
	var eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein: ");
	var eingabe2 = eingabe.toLowerCase();
	for (var i = 0; i < eingabe2.length(); i++) {
	    switch (eingabe2.charAt(i)) {
	    case 'a':
		aZaehler++;
		break;
	    case 'e':
		eZaehler++;
		break;
	    case 'i':
		iZaehler++;
		break;
	    case 'o':
		oZaehler++;
		break;
	    case 'u':
		uZaehler++;
		break;
	    }
	}
	System.out.println("Die Eingabe \"" + eingabe + "\" enthält:");
	System.out.println(aZaehler + " mal a");
	System.out.println(eZaehler + " mal e");
	System.out.println(iZaehler + " mal i");
	System.out.println(oZaehler + " mal o");
	System.out.println(uZaehler + " mal u");
    }

}