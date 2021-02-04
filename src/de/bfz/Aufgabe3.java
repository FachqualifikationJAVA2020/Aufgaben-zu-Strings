import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Gib ein Wort oder Satz oder whatever ein, bestätige mit [Enter]: ");
        String s = sc.nextLine();
        System.out.println("Gib ein Zeichen oder eine Zeichenkette ein, wonach gesucht werden soll: ");
        String c = sc.next();
        
        sc.close();
        
        int count = 0;
        
        for (int i = 0; (i = s.indexOf(c, i)) != -1; count++) {
            i += c.length();
        }
        System.out.println("Das Zeichen " + c + " kommt " + count + " Mal vor.");    
    }
}

// AUFGABENSTELLUNG: Das Programm soll einen String einlesen. 
//                   Danach soll geprüft werden wie oft der Buchstabe ‘a‘ unmittelbar vor dem Buchstaben ‘ u‘ in dem String vorkommt.  
//                   Z.B. Auslauf  → 2 .Erweitern Sie das Programm so, das der Benutzer die Buchstaben ebenfalls eingeben kann, nach denen gesucht werden soll.
