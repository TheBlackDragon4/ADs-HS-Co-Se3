package uebung07;

public class BinaryTreeTest {

	public static void main(String[] args) {

		testKlasseBinaryTreeA1();
//		testKlasseBinaryTree();

	}

	public static void testKlasseBinaryTree() {

		BinaryTree tree = new BinaryTree();
		
		tree.insert(5);
		tree.insert(20);
		tree.insert(4);
		tree.insert(10);
		tree.insert(9);
		tree.insert(12);
		tree.insert(7);
		tree.insert(22);
		tree.insert(3);
		tree.insert(14);
		tree.insert(4);
		tree.insert(13);
		tree.insert(6);

//		System.out.println(tree.height(position));

	}

	public static void testKlasseBinaryTreeA1() {

		BinaryTreeA1 bt = new BinaryTreeA1();

		bt.insert(5);
		bt.insert(20);
		bt.insert(8);
		bt.insert(10);
		bt.insert(9);
		bt.insert(12);
		bt.insert(7);
		bt.insert(22);
		bt.insert(3);
		bt.insert(14);
		bt.insert(4);
		bt.insert(13);
		bt.insert(6);

		System.out.println(bt.height());

	}

}
