package Trie;
//Given a string of length n of lowercase alphabet characters, we need to count total number of unique substrings.
public class countUniqueSubstrings {
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
    public static int countNode(Node root){
        if(root == null) return 0;
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
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
    public static void main(String[] args) {
        String str = "ababa";
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
