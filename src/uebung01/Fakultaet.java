package uebung01;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a number to calculate the faculty of it: ");
		int faculty = sc.nextInt();

		System.out.println("iterativ: " + faculty + "! = " + facultyiterativ(faculty));
		System.out.println("recursiv: " + faculty + "! = " + facultyrecusiv(faculty));

		sc.close();
	}

	public static int facultyiterativ(int faculty) {
		int result = 1;

		// Alternative mit For-Schleife -> Vielleicht sogar etwas eleganter
		do {
			result = result * faculty; // 1 * 5 -> 5 * 4 -> 20 * 3 -> 60 * 2 -> 120 * 1 -> Abbruch
			--faculty;
		} while (faculty > 0);

//		for( int i = 1; i < faculty; i++) {
//			result *= (faculty - i); // 5 * 4 * 3 * 2 * 1
//		}

		return result;
	}

	public static int facultyrecusiv(int faculty) {

		if (faculty <= 1) {
			return 1;
		} else {
			return facultyrecusiv(faculty - 1) * faculty;
		}
	}

}
