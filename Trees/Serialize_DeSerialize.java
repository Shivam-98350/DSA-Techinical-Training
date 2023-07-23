import java.util.*;


public class Serialize_DeSerialize {

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

        System.out.println("Level order traversal ");
        levelorderTraversal(root);

        String data = serialize(root);
        System.out.println("\nSerialize String is "+data);

        BinaryTree<Integer> node =deserialize(data);

        
        System.out.println("\nLevel order traversal from serialize string");
        levelorderTraversal(node);
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

    private static BinaryTree<Integer> deserialize(String data) {
        
        String[] arr=data.split(",");
        Queue<String> q =  new LinkedList<>();

        for(String x:arr)q.add(x);

        BinaryTree<Integer> root = helper(q);

        return root;
    }

    private static BinaryTree<Integer> helper(Queue<String> q) {
        if(q.size()==0)return null;
        String top= q.poll();
        if(top.equals("null"))return null;

        BinaryTree<Integer> root = new BinaryTree<>(Integer.parseInt(top));
        root.left=helper(q);
        root.right=helper(q);

        return root;
    }

    private static String serialize(BinaryTree<Integer> root) {

        if(root==null)return "null";

        String left=serialize(root.left);
        String right = serialize(root.right);


        return root.data+","+left+","+right;
    }
    
}
