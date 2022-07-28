package uebung05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Max", "Mustermann");
		Student s2 = new Student("Sebastian ", "Test");

		s1.studentenHinzufuegen();
		s2.studentenHinzufuegen();
		
		String[] test = s1.getStudentenArray();
		System.out.println(test.length);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		

	}

}
