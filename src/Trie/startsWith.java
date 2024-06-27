package Trie;
//Create a function boolean startsWith(String prefix) for a trie. Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
public class startsWith {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){   //O(L)
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }
}
