import java.util.*;

public class DiagonalView {
    
   public static void main(String[] args) {

        BinaryTree<Integer> root = new BinaryTree<>(5);
        root.left=new BinaryTree<>(6);
        root.left.left=new BinaryTree<>(7);
        root.left.right=new BinaryTree<>(8);
        root.right=new BinaryTree<>(9);
        root.right.left=new BinaryTree<>(10);
        root.right.right=new BinaryTree<>(11);
        root.right.right.right=new BinaryTree<>(12);
        root.right.right.left=new BinaryTree<>(13);

        verticalTraverse(root);
        
    }

    private static void verticalTraverse(BinaryTree<Integer> root) {

        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        Queue<pair> q= new LinkedList<>();

        q.add(new pair(root, 0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(!q.isEmpty())
        {
            pair temp = q.remove();
            map.putIfAbsent(temp.x, new ArrayList<>());
            map.get(temp.x).add(temp.node.data);
            min=Math.min(min,temp.x);
            max=Math.max(max,temp.x);
            if(temp.node.left!=null)q.add(new pair(temp.node.left , temp.x-1));
            if(temp.node.right!=null)q.add(new pair(temp.node.right , temp.x+1));
        }

        System.out.println("Left Diagonal View is : ");

        for(int i=min ; i<=0 ; i++)
        {
            System.out.print(map.get(i).get(0)+" | ");
        }

        System.out.println("\nRight Diagonal View");

        for(int i=0 ; i<=max ; i++)
        {
            System.out.print(map.get(i).get(0)+" | ");
        }

        

    }
}

class pair
{
    BinaryTree<Integer> node;
    int x;

    pair(BinaryTree<Integer> node,int x)
    {
        this.node=node;
        this.x=x;
    }

}

