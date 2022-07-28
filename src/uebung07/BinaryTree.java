package uebung07;

public class BinaryTree {

	private ADsBinaryNode root;

	/**
	 * Ruf die Methode addRevursive auf um das Befüllen Rekursiv durchführen zu
	 * können
	 * 
	 * @param element -> Wert welcher eingefügt werden soll
	 */
	public void insert(int element) {
		// Wird an die Wurzel -> root entsprechend angehängt
		root = insertHelp(root, element);
	}

	/**
	 * Hinzufügen eines neuen Knoten
	 * 
	 * 1. Fall -> Wenn der aktuell mitgegebene Wert niedriger als der aktuelle WErt
	 * ist, dann Hinzufügung in linkem Bein 2. Fall -> Wenn der aktuell mitgegebene
	 * Wert größer als der aktuelle WErt ist, dann Hinzufügen in rechtem Bein
	 * 
	 * @param currentNode
	 * @param element
	 * @return the current Node
	 */
	private ADsBinaryNode insertHelp(ADsBinaryNode currentNode, int element) {
		if (currentNode == null) {
			return new ADsBinaryNode(element);
		}
		// Rekursiver Hinzufügen neuer Werte in Tree
		if (element < currentNode.value) {
			currentNode.leftChild = insertHelp(currentNode.leftChild, element);
		} else if (element > currentNode.value) {
			currentNode.rightChild = insertHelp(currentNode.rightChild, element);
		} else {
			// Wird nur ausgeführt, wenn der entsprechende Wert -> Value schon im Tree
			// existiert
			return currentNode;
		}
		return currentNode;
	}

	public boolean isEmpty() {

		return false;
	}

	/**
	 * Berechnung und Rückgabe der gesamten Höhe des Trees
	 * 
	 * @param Mitgabe der Position im Tree
	 * @return Position vom Typ int
	 */
	public int height(ADsBinaryNode position) {
		if (root == null) {
			return 0;
		} else {
			return heightHelp(position);
		}
	}

	public int heightHelp(ADsBinaryNode position) {
		int leftCounter = 0;
		int rightCounter = 0;
		if (position.leftChild == null && position.rightChild == null) {
			return 0;
		}
		if (position.leftChild != null) {
			leftCounter += 1;
		}
		if (position.rightChild != null) {
			rightCounter += 1;
		}

		if (leftCounter < rightCounter) {
			return rightCounter;
		} else {
			return leftCounter;
		}
	}

	public boolean isEmpty(ADsBinaryNode currentNode) {
		if (currentNode == null) {
			return true;
		} else {
			return false;
		}
	}

}
