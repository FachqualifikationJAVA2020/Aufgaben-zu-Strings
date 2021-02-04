package de.bfz;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Scanner initialisieren
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine Zeichenkette eingeben: ");

        // Benutzer eingabe in String speichern
        String s = eingabe.nextLine();

        // Benutzer suche in String speichern
        System.out.print("Bitte ein Char eingeben: ");
        String sc = eingabe.nextLine();

        // Scanner eingabe schließen
        eingabe.close();

        // CharCounter
        int charCount = 0;

        // Char position aus String festlegen
        char c = sc.charAt(0);

        // for-Schleife zum duschsuchen des String
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) {
                // Wenn der char im String gefunden wurde, Counter +1
                charCount = charCount + 1;
            }
        }

        // Ausgabe des Counter
        System.out.println("Gefundene Zeichen: " + charCount);


    }
}
