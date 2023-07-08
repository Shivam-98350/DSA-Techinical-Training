import java.util.Arrays;

public class DefineTries {

    static class Node {

        Node[] children;
        boolean isTerminal;

        public Node() {
            children = new Node[26];
            Arrays.fill(children, null);

            isTerminal = false;
        }

    }

    static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            if (i == word.length() - 1) {
                current.children[index].isTerminal = true;
                System.out.println(word + " is Inserted in the TRIE...");
            }

            current = current.children[index];

        }
    }

    static boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            Node node = current.children[index];

            if (node== null) {
               return false;
            }

            if (i == word.length() - 1 && node.isTerminal ==false) {
                return false;
            }

            current = current.children[index];

        }
        return true;
    }
    static boolean delete(String word) {
       
        return true;
    }

    static Node root = new Node();

    static void dfsTrie(Node root,String s)
    {
        Node node =root;

        for(int i=0;i<26;i++)
        {
            if(node.children[i]!=null)
            {
                if(node.children[i].isTerminal==true)
                {
                    System.out.println(s+(char)(i+'a'));
                }
                else{
                    dfsTrie(node.children[i], s+(char)(i+'a'));
                }
            }
        }

    }

    public static void main(String[] args) {

        String arr[] = { "apple", "cat", "bag", "apes", "apply" };

        for (String s : arr) {
            insert(s);
        }

         String arr1[] = { "apple", "cat", "bag", "boy","shivam","apes", "apply" };

        for (String s : arr1) {
            System.out.println(s+" is present : "+search(s));
        }

        System.out.println("Traversal of the TRIE is ");
        dfsTrie(root,"");
    }

}
