package uebung01;

import java.util.Scanner;

public class GGTohneFunktion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte nat�rliche Zahl A eingeben: "); // 1978
		int natuerlichezahlA = sc.nextInt();
		System.out.print("Bitte nat�rliche Zahl B eingeben: "); // 2021
		int natuerlichezahlB = sc.nextInt();

		int rest = 1;
		int temp = 0;
		int tempA = 0, tempB = 0;
		int ggT = 0;

		// L�uft nur durch die Schleife, sobald die Nat�rliche Zahl A kleiner als
		// nat�rliche Zahl B ist
		if (natuerlichezahlA < natuerlichezahlB) {
			temp = natuerlichezahlA;
			natuerlichezahlA = natuerlichezahlB;
			natuerlichezahlB = temp;
		}

		// Werte in ZahlA und ZahlB in anderer Variable speichern
		tempA = natuerlichezahlA;
		tempB = natuerlichezahlB;
		
		// Laufe solange durch die Funktion durch, bis der Rest gr��er als 0 ist
		do {
			rest = natuerlichezahlA % natuerlichezahlB;
			// �berpr�fung ob der Rest ungleich 0 ist
			if (rest != 0) {
				ggT = rest;
			}
			natuerlichezahlA = natuerlichezahlB;
			natuerlichezahlB = rest;

		} while (rest > 0);

		// Ausgabe
		System.out.println("ggT(" + tempA + "," + tempB + ") = " + ggT);

		sc.close();

	}

}
