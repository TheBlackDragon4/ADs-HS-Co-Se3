package uebung05;

public class Student {

	private String vorname;
	private String nachname;
	private String[] studentenArray;
	private static int counter;

	public Student(String vorname, String nachname) {
		Student.counter++; // Statische Variable -> soll sich erhöhen, wenn Konstruktor aufgerufen wurde
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String[] getStudentenArray() {
		System.out.println(studentenArray.length);
		return studentenArray;
	}

	public void studentenHinzufuegen() {
		this.studentenArray = new String[counter]; // Arrays können nicht automatisch vergrößert werden
		for (int i = 0; i < counter; i++) {
			if (!studentenArray[i].equals(this.nachname)) {
				studentenArray[i] = this.vorname + " " + this.nachname;
			} 
		}
	}

	public String toString() {
		for (int i = 0; i < studentenArray.length; i++) {

		}
		return "";

	}

}
