package uebung02;

public class EinsenRek {

	static String binaerZahl = "";

	public static String umwandlungInBinaerschreibweise(int zahl) {

		if (zahl == 0) {
			return binaerZahl;
		} else {
//			binaerZahl = (zahl % 2) + binaerZahl;
			return (zahl % 2) + umwandlungInBinaerschreibweise(zahl / 2);
		}

	}

	public static void main(String[] args) {

		int zahlUmwandlung = 2085;

		System.out.println("Die Binärzahl von " + zahlUmwandlung + " DEC lautet: "
				+ umwandlungInBinaerschreibweise(zahlUmwandlung) + " BIN ");

	}

}
