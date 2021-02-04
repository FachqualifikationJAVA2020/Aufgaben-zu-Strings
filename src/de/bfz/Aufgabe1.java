package de.bfz;

import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
	// scanner initialisieren    
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Gib ein Wort oder Satz oder whatever ein, bestätige mit [Enter]: ");
	    	// eingabe als string scannen. nextLine(), damit mehr als ein wort gelesen werden kann.
		String s = sc.nextLine();
		// scanner schließen
		sc.close();
		// alle einzelnen zeichen mit println untereinander ausgeben
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("MAGIC *-*"); // add a little spice ;)
    }
}

// AUFGABENSTELLUNG: Schreiben Sie ein Programm in dem der Anwender einen String eingibt und das Programm ihn ein Zeichen pro Zeile auf den Bildschirm ausgibt
    
