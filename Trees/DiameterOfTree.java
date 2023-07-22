public class DiameterOfTree {

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

        int ans = DiameterTree(root);

        System.out.println("Diameter of Tree is " + ans);

    }

    private static int DiameterTree(BinaryTree<Integer> root) {
        if (root == null)
            return 0;

        int left = HeightTree(root.left);
        int right = HeightTree(root.right);

        return Math.max(left + right + 1, Math.max(DiameterTree(root.left), DiameterTree(root.right)));
    }

    private static int HeightTree(BinaryTree<Integer> root) {
        if (root == null)
            return 0;

        return Math.max(HeightTree(root.left), HeightTree(root.right)) + 1;
    }

}
