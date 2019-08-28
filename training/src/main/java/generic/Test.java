package generic;

import generic.bst.BST;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, BST!");

        BST bst = new BST();
        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        bst.printInOrder(bst.getRoot());
        System.out.println(bst.contains(bst.getRoot(), 5));
        System.out.println(bst.contains(bst.getRoot(), 10));

        bst.delete(9);
        bst.printInOrder(bst.getRoot());

        bst.delete(9);
        bst.printInOrder(bst.getRoot());
    }
}
