package uebung03;

public class Exponentialfunktion {

	static int anzahlDurchlaeufe = 0;

	public static long powRek(long x, int n) {

//		if (n == 0) {
//			return 1;
//		} else if (n == 1) {
//			return x;
//		} else {
//			anzahlDurchl�ufe++;
//			return x * powRek(x, n - 1);
//		}
		
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else if(n % 2 == 0) {
			anzahlDurchlaeufe++;
			return powRek(x * x, n/2);
		} else {
			return powRek(x * x, n/2) * x;
		}
		
	}

	public static long powIter(long x, int n) {

		//long ergebnis = (long) Math.pow(x, n);
		long result = 1;
		for (int i = 1; i <= n; ++i) {
			result *= x;
		}
		return result;
	}

	public static void main(String[] args) {
		long x = 20;
		int n = 50;

		long time = System.nanoTime();
		
		System.out.println("Ergebnis aus Exponantialfunktion - Rekursiv von " + x + "^" + n + " = " + powRek(x, n));
		System.out.println("Anzahl der Durchlaeufe bei Rekursiver loesung: " + anzahlDurchlaeufe);
		System.out.println("Ausgabe der Zeit in Nanosekunden: " + (System.nanoTime() - time));
		
		time = System.nanoTime();
		System.out.println("\nErgebnis aus Exponantialfunktion - Iterativ von " + x + "^" + n + " = " + powIter(x, n));
		System.out.println("Ausgabe der Zeit in Nanosekunden: " + (System.nanoTime() - time));
	}

}
