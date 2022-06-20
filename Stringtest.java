package de.habelitz.uebung07;

/*
 * Programm Stringtest zur Demonstration des Umgangs
 * mit der Klasse String
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Stringtest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	var vorname = JOptionPane.showInputDialog("Ihr Vorname:");
	var nachname = JOptionPane.showInputDialog("Ihr Nachname:");
	var altersangabe = JOptionPane.showInputDialog("Ihr Alter:");
	var alter = Double.parseDouble(altersangabe);
	var name = vorname + " " + nachname;
	System.out.println("Sie heißen " + name);
	System.out.println("Ihr Vorname besteht aus " + vorname.length() + " Zeichen");
	System.out.println("Ihr Nachname beginnt mit " + nachname.charAt(0));
	if ((alter - 18) >= 0) {
	    System.out.println("Sie sind seit " + String.valueOf(alter - 18) + " Jahren volljährig!");
	} else {
	    System.out.println("Sie werden in " + String.valueOf(18 - alter) + " Jahren volljährig!");
	}
	if (vorname.compareTo(nachname) < 0) {
	    System.out.println("Ihr Vorname ist lexikalisch vor " + "dem Nachnamen einzusortieren!");
	} else {
	    if (vorname.compareTo(nachname) > 0) {

		System.out.println("Ihr Vorname ist lexikalisch hinter dem Nachnamen einzusortieren!");
	    } else {
		if (vorname.compareTo(nachname) == 0) {

		    System.out.println("Ihr Vorname ist identisch mit dem Nachnamen!");
		}
	    }
	}

	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
    }

}
