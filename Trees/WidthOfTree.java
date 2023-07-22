import java.util.*;

public class WidthOfTree {
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

        WidthTree(root);

    }

    private static void WidthTree(BinaryTree<Integer> root) {

        Queue<BinaryTree<Integer>> q = new LinkedList<>();

        q.add(root);
        int maxWidth = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int n = q.size();
            maxWidth = Math.max(maxWidth, n);
            while (n-- > 0) {
                BinaryTree<Integer> temp = q.remove();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }

        }

        System.out.println("Width of Tree is : " + maxWidth);

    }
}
