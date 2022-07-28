package uebung05;

public class SeminarverwaltungTest {

	public static void main(String[] args) {

		seminarVerwaltungLinkedList s1 = new seminarVerwaltungLinkedList();

		s1.Seminare();
		s1.anmelden("Ultsch");
		s1.anmelden("Leybold");
		s1.anmelden("Gros");

		System.out.println("Pruefen ob Name enthalten: " + s1.pruefen("Ultsch"));
		System.out.println("Ausgabe Anzahl: " + s1.anzahl());

		System.out.println(s1.toString());

	}

}
