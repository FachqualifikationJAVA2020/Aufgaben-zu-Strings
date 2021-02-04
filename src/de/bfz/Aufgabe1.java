package de.bfz;

import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
        // Scanner initialisieren
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine Zeichenkette eingeben: ");

        // Benutzer eingabe in String speichern
        String text = eingabe.nextLine();

        // Scanner eingabe schließen
        eingabe.close();

        // Nochmal die eingabe vom Benutzer ausgeben
        System.out.println("Eingegebener Text: " + text);

        /*
         * ARRAY VARIANTE
         */
        System.out.println("--- ARRAY VARIANTE ---");

        // Einzelne Buchstaben von text in Array speichern
        String[] buchstaben = text.split("");

        // Jeder Buchstaben durchlaufen und Ausgeben
        for(int i = 0; i < buchstaben.length; i ++){
            System.out.println(buchstaben[i]);
        }

        /*
         * CHARAT() VARIANTE
         */
        System.out.println("--- CHARAT() VARIANTE ---");

        // Jeder Buchstabe von text durchlaufen und ausgeben
        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }

    }
}
