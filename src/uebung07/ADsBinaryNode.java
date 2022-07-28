package uebung07;

public class ADsBinaryNode {

	int value;
	ADsBinaryNode leftChild; // Zeiger auf linke KindKnoten
	ADsBinaryNode rightChild; // Zeiger auf linke Kind rechter Knoten

	// Konstruktor
	ADsBinaryNode(int value) {
		// erste Initialisierung von den Knoten
		this.value = value;
		rightChild = null; // rechter Knoten ist am Anfang leer
		leftChild = null; // linker Knoten ist am Anfang leer
	}

}
