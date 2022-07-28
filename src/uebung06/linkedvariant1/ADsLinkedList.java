package uebung06.linkedvariant1;

import uebung06.ADsList;

public class ADsLinkedList implements ADsList {

	private ADsListNode head;

	public ADsLinkedList() {
		// intentionally left blank
	}

	// Konstruktor
	public ADsLinkedList(Object... elements) {
		ADsListNode node = null;
		for (int i = 0; i < elements.length; i++) {
			if (i == 0) {
				head = new ADsListNode(elements[i]);
				node = head;
			} else {
				ADsListNode next = new ADsListNode(elements[i]);
				node.next = next;
				node = next;
			}
		}
	}

	@Override
	// Gibt die Länge der LinkedList heraus
	public int size() {
		// TODO Auto-generated method stub
		int count = 0;
		ADsListNode node = head; // erster Wert der Liste ist head
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	@Override
	// Fügt ein neues Element zur LinkedList hinzu
	public void insert(int pos, Object elem) {
		// TODO Auto-generated method stub
		if (pos == 0) {
			if (head == null) {
				head = new ADsListNode(elem);
			} else { // normaler BubbleSort Algorithmus
				ADsListNode node = new ADsListNode(elem);
				node.next = head;
				head = node;
			}
		} else if (pos > 0) {
			ADsListNode iterator = head;
			int count = 0;
			while ((count != pos - 1) && (iterator != null)) {
				count++;
				iterator = iterator.next;
			}
			if (iterator != null) { // normaler BubbleSort Algorithmus
				ADsListNode node = new ADsListNode(elem);
				node.next = iterator.next;
				iterator.next = node;
			} else {
				; // error: pos > number of elements: invalid position
			}
		} else {
			; // error: pos < 0: invalid position
		}
	}

	@Override
	// Entfernt ein Element aus der LinkedList und gibt eine neue Liste zurück
	public void remove(int pos) {
		// TODO Auto-generated method stub
		// wirft eine neue Exception, da head = null und positionswert negtiv also
		// niedriger als 0 ist
		if (head == null || pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (pos == 0) {
			head = head.next;
		} else {
			int count = 0;
			ADsListNode node = head;
			while (pos >= count) {
				if (count == pos) {
					node = node.next.next;
					break;
				}else {
					node = node.next;
					++count;
				}
			}
		}
	}

	@Override
	// Ausgabe des Elements an der mitgegebenen Position
	public Object elementAt(int pos) {
		// TODO Auto-generated method stub
		int count = 0;
		ADsListNode node = head;
		if (pos < 0 || pos > size()) {
			throw new IndexOutOfBoundsException();
		} else {
			// läuft durch die Liste hindurch und überprüft, ob der node != null also noch
			// nicht am Ende ist und ob der count < als die Position welche gewünscht ist
			while (node != null && count < pos) {
				node = node.next; // Erhöhung und nächste node zuweisen, da die eigentliche Node nicht erreicht
									// wurdes
				++count;
			}
		}
		return node.element; // sobald count und position erreicht wurde, wird hier das Element an der
								// Position ausgegeben
	}

	@Override
	// finden eines Elements in der Liste welches mitgegeben wurde -> Rückgabe ist
	// die Position in der Liste
	public int find(Object element) {
		// TODO Auto-generated method stub
		ADsListNode node = head;
		int pos = 0;
		while (node != null) {
			// Prüft ob das Element an Position node gleich dem mitgegebene Element ist ->
			// Prüft auf Inhaltsgleichheit
			if (node.element != null && node.element.equals(element)) {
				return pos;
			} else { 
				node = node.next; // Wenn das Element nicht gefunden wurde, wird node auf das nächste Element
									// gesetzt
				++pos; // Erhöhung des Counts um 1
			}
		}
		// Konvention
		return -1; // Falls Element nicht gfunden wurde
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			return true; // Falls "true" herauskommen sollte -> Liste ist Leer
		} else {
			return false; // Falls "false" herauskommen sollte -> Liste beinhaltet ein Element
		}
	}
}
