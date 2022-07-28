package uebung05;

import java.util.LinkedList;

public class seminarVerwaltungLinkedList implements Seminare {

	// LinkedListen sind durch *.add erweiterbar
	private LinkedList<String> studenten;

	public void Seminare() {
		// Erstellt eine neue LinkedList aus verschiedenen Strings
		studenten = new LinkedList<String>();
	}

	@Override
	// Hinzufügen neuer Objekte an die LinkedListe
	public void anmelden(String nachname) {
		// TODO Auto-generated method stub
		studenten.add(nachname); // Hinzufügen des Nachnamens ans Ende der LinkedListe -> Objekt muss ein String
									// sein
	}

	@Override
	public boolean pruefen(String nachname) {
		// TODO Auto-generated method stub
		return studenten.contains(nachname);
	}

	@Override
	public int anzahl() {
		// TODO Auto-generated method stub
		int result = studenten.size();
		return result;
	}

	public String toString() {
		String result = "Nachnamenausgabe der Teilnehmer: ";
		for (String st : studenten) {
			result += st + " ";
		}
		return result;
	}

}
