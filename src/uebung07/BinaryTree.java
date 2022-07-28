package uebung07;

public class BinaryTree {

	private ADsBinaryNode root;

	/**
	 * Ruf die Methode addRevursive auf um das Bef�llen Rekursiv durchf�hren zu
	 * k�nnen
	 * 
	 * @param element -> Wert welcher eingef�gt werden soll
	 */
	public void insert(int element) {
		// Wird an die Wurzel -> root entsprechend angeh�ngt
		root = insertHelp(root, element);
	}

	/**
	 * Hinzuf�gen eines neuen Knoten
	 * 
	 * 1. Fall -> Wenn der aktuell mitgegebene Wert niedriger als der aktuelle WErt
	 * ist, dann Hinzuf�gung in linkem Bein 2. Fall -> Wenn der aktuell mitgegebene
	 * Wert gr��er als der aktuelle WErt ist, dann Hinzuf�gen in rechtem Bein
	 * 
	 * @param currentNode
	 * @param element
	 * @return the current Node
	 */
	private ADsBinaryNode insertHelp(ADsBinaryNode currentNode, int element) {
		if (currentNode == null) {
			return new ADsBinaryNode(element);
		}
		// Rekursiver Hinzuf�gen neuer Werte in Tree
		if (element < currentNode.value) {
			currentNode.leftChild = insertHelp(currentNode.leftChild, element);
		} else if (element > currentNode.value) {
			currentNode.rightChild = insertHelp(currentNode.rightChild, element);
		} else {
			// Wird nur ausgef�hrt, wenn der entsprechende Wert -> Value schon im Tree
			// existiert
			return currentNode;
		}
		return currentNode;
	}

	public boolean isEmpty() {

		return false;
	}

	/**
	 * Berechnung und R�ckgabe der gesamten H�he des Trees
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
