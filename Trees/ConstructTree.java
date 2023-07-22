import java.util.LinkedList;
import java.util.Queue;

public class ConstructTree {

    public static void main(String[] args) {
        
        int inorder[]={4,8,2,5,1,6,3,7};
        int postorder[]={8,4,5,2,6,7,3,1};
        int n=inorder.length;
        BinaryTree<Integer> root=helper(inorder, postorder, 0, n-1, 0, n-1);
        levelorderTraversal(root);

    }
     static void levelorderTraversal(BinaryTree<Integer> root)
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
    
    static BinaryTree<Integer> helper(int inorder[],int postorder[],int instart,int inend,int poststart,int postend)
    {
        if(instart>inend)return null;

        int rootval=postorder[postend];
        BinaryTree<Integer> root=new BinaryTree<Integer>(rootval);
        int rootind=instart;
        for(;rootind<=inend;rootind++)
        {
            if(inorder[rootind]==rootval)
            {
                break;
            }
        }

        int leftsize=rootind-instart;
        int rightsize=inend-rootind;

        root.left=helper(inorder,postorder,instart,rootind-1,poststart,poststart+leftsize-1);
        root.right=helper(inorder,postorder,rootind+1,inend,postend-rightsize,postend-1);

        return root;
    }
    
}
