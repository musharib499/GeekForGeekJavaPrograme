package com.dare.truth.javaprograme;


/**
 * Created by User on 4/30/2017.
 */

public class LowestCommonAncestor {

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(3);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(11);
        tree.root.left.right.left = new Node(9);
        tree.root.left.right.right = new Node(5);
        tree.root.right.right = new Node(13);
        tree.root.right.right.left = new Node(7);
       // System.out.println("Keys are not present"+tree.root);
        Node lca = tree.findLCA(7, 8);
        if (lca != null)
            System.out.println("LCA(2, 5) = " + lca.data);
        else
            System.out.println("Keys are not present");

        //lca = tree.findLCA(tree.root,4, 10);

    }
    Node root;
    static boolean v1 = false, v2 = false;

    // This function returns pointer to LCA of two given
    // values n1 and n2.
    // v1 is set as true by this function if n1 is found
    // v2 is set as true by this function if n2 is found
    Node findLCAUtil(Node node, int n1, int n2)
    {
        // Base case
        if (node == null)
            return null;

        // If either n1 or n2 matches with root's key, report the presence
        // by setting v1 or v2 as true and return root (Note that if a key
        // is ancestor of other, then the ancestor key becomes LCA)
        if (node.data == n1)
        {
            v1 = true;
            return node;
        }
        if (node.data == n2)
        {
            v2 = true;
            return node;
        }

        // Look for keys in left and right subtrees
        Node left_lca = findLCAUtil(node.left, n1, n2);
        Node right_lca = findLCAUtil(node.right, n1, n2);

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca != null && right_lca != null)
            return node;

        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }

    // Finds lca of n1 and n2 under the subtree rooted with 'node'
    Node findLCA(int n1, int n2)
    {
        // Initialize n1 and n2 as not visited
        v1 = false;
        v2 = false;

        // Find lca of n1 and n2 using the technique discussed above
        Node lca = findLCAUtil(root, n1, n2);

        // Return LCA only if both n1 and n2 are present in tree
        if (v1 && v2)
            return lca;

        // Else return NULL
        return null;
    }


}
