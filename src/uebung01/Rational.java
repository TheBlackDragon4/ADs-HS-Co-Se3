package uebung01;

// Definition of class Rational

public class Rational {
	private int numerator; // Zaehler
	private int denominator; // Nenner

	// Initialize numerator to 0 and denominator to 1
	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to 1
	public Rational(int n) {
		numerator = n;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to d
	public Rational(int n, int d) {
		assert (d != 0);

		numerator = n; // Zähler
		denominator = d; // Nenner
		reduce();
	}

	// Add two Rational numbers
	public Rational sum(Rational right) {
		// TODO: addition
		int additionNumerator = 0;
		int additionDenumerator = 0;
		Rational result = null;

		// Prüfung ob Nenner den gleichen Wert haben
		if (this.denominator == right.denominator) {
			// Wenn dem so ist, müssen nur noch die Zähler Addiert werden
			additionNumerator = this.numerator + right.numerator;
			additionDenumerator = this.denominator;
		} else {
			// Wenn die Nenner unterschiedlich sind, müssen die Zähler und Nenner neu
			// berechnet werden
			additionDenumerator = this.denominator * right.denominator;
			additionNumerator = (this.numerator * right.denominator) + (right.numerator * this.denominator);
		}
		
		// Deklaration des neu erstellten result Objektes vom Typ Rational
		result = new Rational(additionNumerator, additionDenumerator);
		
		// Rückgabe des verlangten Objektes vom Typ Rational
		return result;
	}

	// Subtract two Rational numbers
	// return a Rational result object
	public Rational subtract(Rational right) {
		// TODO: subtraction
		return null;
	}

	// Multiply two Rational numbers
	// return a Rational result object
	public Rational multiply(Rational right) {
		// TODO: multiplication
		return null;
	}

	// Divide two Rational numbers
	// return a Rational result object
	public Rational divide(Rational right) {
		// TODO: division
		return null;
	}

	// Reduce the fraction
	private void reduce() {
		assert (denominator != 0);
		// TODO: gcd reduction
		assert (denominator != 0);
	}

	public void toScreen() {
		System.out.println("Wert " + this.toString());
	}

	// Return String representation of a Rational number
	public String toString() {
		return numerator + "/" + denominator;
	}

}