package de.habelitz.uebung07;
/* Programm zur Messung des Zeitbedarfs für die Eingabe des
 * eigenen Namens
 * @date 2019-09-01
 * @author Hans-Peter Habelitz
 */

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Eingabedauer {

	public static void main(String[] args) {
		var startEingabeAufforderung = Instant.now();
		JOptionPane.showInputDialog("Geben Sie Ihren Namen ein");
		var endeDerEingabe = Instant.now();
		var dauer = Duration.between(startEingabeAufforderung, endeDerEingabe);
		System.out.println("Dauer nach ISO-8601: " + dauer);
		System.out.println("Dauer in Minuten: " + dauer.toMinutes());
		System.out.println("Dauer in Sekunden: " + dauer.getSeconds());
		System.out.println("Dauer in Millisekunden: " + dauer.toMillis());
	}

}
