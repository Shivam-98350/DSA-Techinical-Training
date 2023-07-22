public class BalanceTree {

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
        // root.right.right.right.right = new BinaryTree<>(14);
        
        boolean ans =balanceTree(root);
        System.out.println("Tree is Balance Tree : "+ans);

    }

    private static boolean balanceTree(BinaryTree<Integer> root) {

        if(root==null)return true;

        int left=HeightTree(root.left);
        int right = HeightTree(root.right);


        return(Math.abs(left-right)<=1 && balanceTree(root.left) && balanceTree(root.right));
    }

    private static int HeightTree(BinaryTree<Integer> root) {
        if (root == null)
            return 0;

        return Math.max(HeightTree(root.left), HeightTree(root.right)) + 1;
    }
    
}
