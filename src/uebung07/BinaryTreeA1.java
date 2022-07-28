package uebung07;

public class BinaryTreeA1 {

	private boolean empty;
	private int element;
	private BinaryTreeA1 leftChild;
	private BinaryTreeA1 rightChild;

	// Standardkonstruktor
	public BinaryTreeA1() {
		empty = true;
		this.element = 0;
		leftChild = null;
		rightChild = null;
	}

	public BinaryTreeA1(int element) {
		empty = false;
		this.element = element;
		leftChild = null;
		rightChild = null;
	}

	public int elementAt(int position) {

		return position;
	}

	public void insert(int element) {
		if (empty) {
			this.element = element;
			empty = false; // Ein Element im Baum
		} else if (element < this.element) {
			insertLeft(element);
		} else if (element > this.element) {
			insertRight(element);
		}
	}

	public void insertLeft(int element) {
		if (leftChild == null) {
			leftChild = new BinaryTreeA1(element);
		} else {
			leftChild.insert(element);
		}
	}

	public void insertRight(int element) {
		if (rightChild == null) {
			rightChild = new BinaryTreeA1(element);
		} else {
			rightChild.insert(element);
		}
	}

	public int height() {
		if (empty) {
			return 0;
		} else {
			return heightHelp(0);
		}
	}

	public int heightHelp(int counter) {
		int left = 0;
		int right = 0;
		if (leftChild == null && rightChild == null) {
			return counter;
		}
		if (leftChild != null) {
			left = leftChild.heightHelp(counter + 1);
		}
		if (rightChild != null) {
			right = rightChild.heightHelp(counter + 1);
		}
		if (left < right) {
			return right;
		} else {
			return left;
		}
		
		// größerer Teilbaum + 1 
	}

	public boolean isEmpty() {
		return empty;
	}

}
