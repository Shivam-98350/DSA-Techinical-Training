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

    static Node root = new Node();

    public static void main(String[] args) {

        String arr[] = { "apple", "cat", "bag", "apes", "apply" };

        for (String s : arr) {
            insert(s);
        }

    }

}
