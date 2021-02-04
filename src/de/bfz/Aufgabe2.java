import java.util.Scanner;

public class Aufgabe2 {         // laut aufgabenstellung CharCount, aber das passt schon ;)
	
  public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gib ein Wort  oder Satz oder whatever ein, bestätige mit [Enter]: ");
		String s = sc.nextLine();
		System.out.println("Gib ein Zeichen ein, nach dem gesucht werden soll: ");
		char c = sc.next().charAt(0);
		sc.close();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char cc = s.charAt(i);
			if (cc == c) {
				count++;
			}		
		}
		System.out.println("Das Zeichen " + c + " kommt " + count + " Mal vor.");
    }
}


// AUFGABENSTELLUNG: Schreiben Sie eine Klasse CharCount, die zählt, wie oft ein bestimmtes Zeichen in einem String vorkommt. 
//                   Daber soll ein String s eingeben und ein einzelnes Zeichen char c eingelesen und gezählt, wie oft c in s vorkommt. 
//                   Kommt c nicht in s vor, so wird 0 zurückgegeben.
