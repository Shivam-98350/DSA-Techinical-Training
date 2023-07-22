import java.util.*;
import java.util.Stack;

class BinaryTree<T>
{
    BinaryTree<T> left;
    BinaryTree<T> right;
    T data;

    BinaryTree(T data){
        this.data=data;
        right=left=null;
    }

}

public class BinaryTreeops {
    String msg="root";

     BinaryTree<Integer> insert()
    {
        System.out.println("Enter the "+msg+" data");
        try (Scanner sc = new Scanner(System.in)) {
            int val=sc.nextInt();

            if(val==-1)return null;
            BinaryTree<Integer> node = new BinaryTree<>(val);
            msg="left";
            node.left=insert();
            msg="right";
            node.right=insert();
            msg="root";

            return node;
        }
    }

    void InorderTraversal(BinaryTree<Integer> root)
    {
        if(root==null)return;

        InorderTraversal(root.left);
        System.out.print(root.data+" | ");
        InorderTraversal(root.right);

    }

     void preorderTraversal(BinaryTree<Integer> root)
    {
        if(root==null)return;

        System.out.print(root.data+" | ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }

     void postorderTraversal(BinaryTree<Integer> root)
    {
        if(root==null)return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" | ");

    }

    void levelorderTraversal(BinaryTree<Integer> root)
    {
        Queue<BinaryTree<Integer>> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int n=q.size();
            while(n-->0)
            {
                BinaryTree<Integer> node = q.remove();
                System.out.print(node.data+" | ");
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }

            System.out.println("\n----------------------------------------\n");
        }


    }

    void preOrderIterative(BinaryTree<Integer> root)
    {
        if(root==null)return;

        Stack<BinaryTree<Integer>> st= new Stack<>();

        BinaryTree<Integer> current=root;

        while(!st.isEmpty() || current!=null)
        {
            if(!st.isEmpty() && current==null)
            {
                current=st.pop();
            }

            System.out.print(current.data+" | ");

            if(current.right!=null)
            {
                st.push(current.right);
            }

            current = current.left;
        }
    }

    void inOrderIterative(BinaryTree<Integer> root) {

        if(root==null)return;

        Stack<BinaryTree<Integer>> st= new Stack<>();

        BinaryTree<Integer> current=root;

        while(!st.isEmpty() || current!=null)
        {
            while(current!=null)
            {
                st.push(current);
                current=current.left;
            }

            current=st.pop();
            System.out.print(current.data+" | ");
            
            current=current.right;
        }

    }

    void postOrderIterative(BinaryTree<Integer> root) {

        
        
    }

    public static void main(String[] args) {
        BinaryTreeops obj = new BinaryTreeops();
        BinaryTree<Integer> root = new BinaryTree<>(5);
        root.left=new BinaryTree<>(6);
        root.left.left=new BinaryTree<>(7);
        root.left.right=new BinaryTree<>(8);
        root.right=new BinaryTree<>(9);
        root.right.left=new BinaryTree<>(10);
        root.right.right=new BinaryTree<>(11);
        System.out.println("\nlevel order");
        obj.levelorderTraversal(root);
        System.out.println("\nInorder ");
        obj.InorderTraversal(root);
        System.out.println("\npostOrder");
        obj.postorderTraversal(root);
        System.out.println("\npreorder");
        obj.preorderTraversal(root);
        System.out.println("\npreorder");
        obj.preOrderIterative(root);
        System.out.println("\npostOrder");
        obj.postOrderIterative(root);
        System.out.println("\nInorder ");
        obj.inOrderIterative(root);
    }
    
}
