package uebung06.linkedvariant2;

import uebung06.ADsList;

public class ADsLinkedList implements ADsList {

	private ADsListNode head;

	public ADsLinkedList() {
		head = new ADsListNode(null);
	}

	public ADsLinkedList(Object... elements) {
		this();
		ADsListNode node = head;
		for (int i = 0; i < elements.length; i++) {
			ADsListNode next = new ADsListNode(elements[i]);
			node.next = next;
			node = next;
		}
	}

	@Override
	// Rückgabe der Länge der Linked List
	public int size() {
		// TODO Auto-generated method stub
		int count = 0;
		ADsListNode node = head.next; // Header ist Dummy Knoten -> Ersten richtiger Knoten ist "node"
		while (node != null) { // Wenn dieser Knoten zu Ende wäre, dann wäre in dieser Liste nichts enthalten
			count++;
			node = node.next; // Jetzt wird wieder der nächste Knoten gewählt
		}
		return count;
	}

	@Override
	// Hinzufügen von Elementen in die entsprechende Liste
	public void insert(int pos, Object elem) {
		// TODO Auto-generated method stub
		if (pos >= 0) { // Liste wird niemals null, da immer mindestens der header enthalten ist
			ADsListNode iterator = head.next;
			int count = 0;
			while ((count != pos) && (iterator != null)) {
				count++;
				iterator = iterator.next; // nimmt hier das nächste Element in der Liste heraus
			}
			if (iterator != null) {
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
	public void remove(int pos) {
		// TODO Auto-generated method stub
		if (head.next == null || pos == 0) {
			throw new IndexOutOfBoundsException();
		}
		ADsListNode node = head.next;
		if (pos == 1) { // Hier muss die Position echt größer 0 sein
			node = head;
		} else {
			int count = 0;
			while (count != pos) {
				if (count == pos) {
					node = node.next;
				} else {
					++count;
				}
			}
		}
	}

	@Override
	public Object elementAt(int pos) {
		// TODO Auto-generated method stub
		int count = 0;
		ADsListNode node = head.next;
		if(pos < 1 || pos > size()) {
			throw new IndexOutOfBoundsException();
		}else {
			while (node != null && count < pos) {
				node = node.next; // Iterieren durch die Liste und aufgreifen jedes Element in dieser
				++count; // Erhöhen des Counters um 1
			}
		}
		return node.element; // Rückgabe des Elements an Position "node"
	}

	@Override
	public int find(Object element) {
		// TODO Auto-generated method stub
		ADsListNode node = head.next;
		int count = 0;
		while (node != null) {
			if (node.element.equals(element)) {
				return count; // Wenn *.equals = true -> return count als Positionsangabe in der Liste
			} else {
				node = head.next; // Wenn Element nicht gefunden wird, dann wird das nächste Element genutzt
				++count; // Counter für das Iterieren um eins erhöhen
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head.next == null) {
			return true;
		} else {
			return false;
		}
	}
}
