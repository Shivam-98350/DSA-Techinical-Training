public class BoundaryTraversal {
    public static void main(String[] args) {

        BinaryTree<Integer> root = new BinaryTree<>(5);
        root.left = new BinaryTree<>(6);
        root.left.left = new BinaryTree<>(7);
        root.left.right = new BinaryTree<>(8);
        root.right = new BinaryTree<>(9);
        root.right.left = new BinaryTree<>(10);
        root.right.right = new BinaryTree<>(11);
        root.right.right.right = new BinaryTree<>(12);
        root.right.right.left = new BinaryTree<>(13);

        verticalTraverse(root);

    }

    private static void verticalTraverse(BinaryTree<Integer> root) {

        System.out.println("Boundary Traversal is : ");
        System.out.print(root.data + " | ");
        printLeft(root.left);
        printleaves(root.left);
        printleaves(root.right);
        printRight(root.right);

    }

    private static void printRight(BinaryTree<Integer> root) {

        if (root == null)
            return;

        if (root.right != null) {
            printRight(root.right);
        } else {
            printRight(root.left);
        }

        if (root.right != null || root.left != null) {
            System.out.print(root.data + " | ");
        }

    }

    private static void printLeft(BinaryTree<Integer> root) {

        if (root == null)
            return;

        if (root.right != null || root.left != null) {
            System.out.print(root.data + " | ");
        }

        if (root.right != null) {
            printLeft(root.right);
        } else {
            printLeft(root.left);
        }

    }

    private static void printleaves(BinaryTree<Integer> root) {
        if (root == null)
            return;

        printleaves(root.left);
        if (root.left == null && root.right == null)
            System.out.print(root.data + " | ");
        printleaves(root.right);
    }
}

class pair {
    BinaryTree<Integer> node;
    int x;

    pair(BinaryTree<Integer> node, int x) {
        this.node = node;
        this.x = x;
    }

}
