import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

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

        System.out.println("Level order Traversal before mirroring ");
        levelorderTraversal(root);
        mirror(root);
        System.out.println("\nLevel order Traversal After mirroring ");
        levelorderTraversal(root);


    }

    private static void mirror(BinaryTree<Integer> root) {

        if(root==null)return;

        BinaryTree<Integer> left=root.left;
        root.left=root.right;
        root.right=left;

        mirror(root.left);
        mirror(root.right);

    }

    static void levelorderTraversal(BinaryTree<Integer> root) {
        Queue<BinaryTree<Integer>> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            while (n-- > 0) {
                BinaryTree<Integer> node = q.remove();
                System.out.print(node.data + " | ");
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            System.out.println("\n----------------------------------------");
        }
    }
}
