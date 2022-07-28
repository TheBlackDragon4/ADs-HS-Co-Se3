package uebung01;

import java.util.Scanner;

public class GGTRekursiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte nat�rliche Zahl A eingeben: "); // 1978
		int natuerlichezahlA = sc.nextInt();
		System.out.print("Bitte nat�rliche Zahl B eingeben: "); // 2021
		int natuerlichezahlB = sc.nextInt();
		int temp = 0;
		
		// L�uft nur durch die Schleife, sobald die Nat�rliche Zahl A kleiner als
		// nat�rliche Zahl B ist
		if (natuerlichezahlA < natuerlichezahlB) {
			temp = natuerlichezahlA;
			natuerlichezahlA = natuerlichezahlB;
			natuerlichezahlB = temp;
		}

		// Werte in ZahlA und ZahlB in anderer Variable speichern
		int tempA = natuerlichezahlA;
		int tempB = natuerlichezahlB;

		System.out.println("ggT(" + tempA + "," + tempB + ") = "
				+ ggTrecursiv(tempA, tempB));

		sc.close();
	}

	public static int ggTrecursiv(int natuerlichezahlA, int natuerlichezahlB) {

		if (natuerlichezahlB == 0) {
			return natuerlichezahlA;
		}else {
			return ggTrecursiv(natuerlichezahlB, natuerlichezahlA % natuerlichezahlB);
		}

	}

}
