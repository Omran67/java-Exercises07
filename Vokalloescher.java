package de.habelitz.uebung07;

/*
 * Programm Vokalloescher entfernt alle Vokale aus
 * der eingegebenen Textzeile und gibt den Text in einem
 * MessageDialog wieder aus.
 * @author Hans-Peter Habelitz
 * @date 2019-09-01
 */

import javax.swing.JOptionPane;

public class Vokalloescher {
    public static void main(String args[]) {
	var e = JOptionPane.showInputDialog("Geben Sie einen Text ein: ");
	var eohneV = new StringBuilder("");
	for (int i = 0; i < e.length(); i++) {
	    if ((e.charAt(i) != 'a') && (e.charAt(i) != 'e')
		    && (e.charAt(i) != 'i') && (e.charAt(i) != 'o')
		    && (e.charAt(i) != 'u') && (e.charAt(i) != 'A')
		    && (e.charAt(i) != 'E') && (e.charAt(i) != 'I')
		    && (e.charAt(i) != 'O') && (e.charAt(i) != 'U')) {
		eohneV.append(e.charAt(i));
	    }
	}
	JOptionPane.showMessageDialog(null, eohneV);
    }
}
