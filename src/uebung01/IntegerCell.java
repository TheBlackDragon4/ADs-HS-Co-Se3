package uebung01;

public class IntegerCell {

	// Variablendeklaration
	float zahl; // Wegen der Division brauchen wir hier ein double -> Alle Werte werden nun als
				// Double ausgegeben

	public IntegerCell(float zahleneingabe) {
		this.zahl = zahleneingabe;
	}

	public IntegerCell add(IntegerCell zahl) {
		// this.zahl = 30 -> This Zahl vom Aufruf der Methode
		// zahl.zahl = 50 -> Die Zahl mit welcher ich die Methode aufgerufen habe
//		System.out.println(this.zahl);
//		System.out.println(zahl.zahl);
		// Hier wird ein neues Objekt vom Typ IntegerCell erzeugt, welches die beiden
		// mitgegebenen Zahlen miteinander addiert
		IntegerCell result = new IntegerCell(this.zahl + zahl.zahl);
		return result;
	}

	public IntegerCell subtract(IntegerCell zahl) {
		IntegerCell result = new IntegerCell(this.zahl - zahl.zahl);
		return result;
	}

	public IntegerCell multiply(IntegerCell zahl) {
		IntegerCell result = new IntegerCell(this.zahl * zahl.zahl);
		return result;
	}

	public IntegerCell division(IntegerCell zahl) {
		IntegerCell result = new IntegerCell(this.zahl / zahl.zahl);
		return result;
	}

	public String toString() {
		return "" + this.zahl;
	}

	public static void main(String[] args) {

		IntegerCell zahl1 = new IntegerCell(30);
		IntegerCell zahl2 = new IntegerCell(50);
		IntegerCell zahl3 = new IntegerCell(80);
		IntegerCell zahl4 = new IntegerCell(100);
		IntegerCell zahl5 = new IntegerCell(150);
		IntegerCell zahl6 = new IntegerCell(180);
		IntegerCell zahl7 = new IntegerCell(60);
		IntegerCell zahl8 = new IntegerCell(70);
		IntegerCell zahl9 = new IntegerCell(40);
		IntegerCell zahl10 = new IntegerCell(200);

		IntegerCell resultat1 = zahl1.add(zahl2);
		IntegerCell resultat2 = zahl3.subtract(zahl4);
		IntegerCell resultat3 = zahl5.multiply(zahl6);
		IntegerCell resultat4 = zahl7.division(zahl8);
		IntegerCell resultat5 = zahl9.add(zahl10);
		IntegerCell resultat6 = resultat1.add(resultat5);

		System.out.println(resultat1);
		System.out.println(resultat2);
		System.out.println(resultat3);
		System.out.println(resultat4);
		System.out.println(resultat5);
		System.out.println(resultat6);

	}

}
