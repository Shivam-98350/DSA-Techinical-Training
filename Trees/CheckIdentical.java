public class CheckIdentical {

    public static void main(String[] args) {
        
        BinaryTree<Integer> root1 = new BinaryTree<>(5);
        root1.left = new BinaryTree<>(6);
        root1.left.left = new BinaryTree<>(7);
        root1.left.right = new BinaryTree<>(8);
        root1.right = new BinaryTree<>(9);
        root1.right.left = new BinaryTree<>(10);
        root1.right.right = new BinaryTree<>(11);
        root1.right.right.right = new BinaryTree<>(12);
        root1.right.right.left = new BinaryTree<>(13);

        BinaryTree<Integer> root2 = new BinaryTree<>(5);
        root2.left = new BinaryTree<>(6);
        root2.left.left = new BinaryTree<>(7);
        root2.left.right = new BinaryTree<>(8);
        root2.right = new BinaryTree<>(9);
        root2.right.left = new BinaryTree<>(10);
        root2.right.right = new BinaryTree<>(11);
        root2.right.right.right = new BinaryTree<>(12);
        root2.right.right.left = new BinaryTree<>(13);

        System.out.println("Trees are identical "+isIdentical(root1,root2));

    }

    private static boolean isIdentical(BinaryTree<Integer> root1, BinaryTree<Integer> root2) {
       
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return false;

        return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right) && root1.data==root2.data);
    }
    
}
