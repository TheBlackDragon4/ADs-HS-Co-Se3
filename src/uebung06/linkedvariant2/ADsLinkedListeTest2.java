package uebung06.linkedvariant2;

import uebung06.linkedvariant2.ADsLinkedList;

public class ADsLinkedListeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ADsLinkedList adLL = new ADsLinkedList(1, 3, 4, 5, 6);

//		System.out.println(adLL.size()); // geht
//		System.out.println(adLL.isEmpty()); // geht
//		System.out.println(adLL.find(5)); // geht
//		System.out.println(adLL.elementAt(3)); // geht
		adLL.remove(2);
		System.out.println(adLL.size());
		System.out.println(adLL.elementAt(2));
//		adLL.insert(6, 20);
//		System.out.println(adLL.size());
		
	}

}
