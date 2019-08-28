package generic.bst;

public class BST {
    TreeNode root;

    public BST() {
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode currentNode, int value) {
        if (currentNode == null) {
            return new TreeNode(value);
        }

        if (currentNode.value > value) {
            currentNode.left = addRecursive(currentNode.left, value);
        } else if (currentNode.value < value) {
            currentNode.right = addRecursive(currentNode.right, value);
        } else {
            return currentNode;
        }

        return currentNode;
    }


    public void printInOrder(TreeNode node) {
        if (node != null) {

            printInOrder(node.left);
            System.out.println(" " + node.value);
            printInOrder(node.right);

        }
    }

    public boolean contains(TreeNode currentNode, int value) {

        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        }

        if (currentNode.value > value) {
            return contains(currentNode.left, value);
        } else {
            return contains(currentNode.right, value);
        }
    }

    private TreeNode deleteRecursive(TreeNode currentNode, int value) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.value == value) {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }

            if (currentNode.right == null) {
                return currentNode.left;
            }

            if (currentNode.left == null) {
                return currentNode.right;
            }
            int smallestValue = findSmallestValue(currentNode.right);
            currentNode.value = smallestValue;
            currentNode.right = deleteRecursive(currentNode.right, smallestValue);
            return currentNode;
        }

        if (currentNode.value > value) {
            currentNode.left = deleteRecursive(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = deleteRecursive(currentNode.right, value);
            return currentNode;
        }
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private int findSmallestValue(TreeNode currentNode) {
        return currentNode.left == null ? currentNode.value : findSmallestValue(currentNode.left);
    }

    public TreeNode getRoot() {
        return root;
    }
}
