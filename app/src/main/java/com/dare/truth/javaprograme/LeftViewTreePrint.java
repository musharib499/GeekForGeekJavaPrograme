package com.dare.truth.javaprograme;

/**
 * Created by User on 5/2/2017.
 */

public class LeftViewTreePrint {
    Node root;
    static int  max_level = 0;
    public static void main(String[] args) {
        LeftViewTreePrint tree=new LeftViewTreePrint();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.leftView();
    }

    public void leftViewTree(Node node,int level)
    {

        if (node==null)
            return;

        if(max_level<level)
        {
            System.out.println("left node "+ node.data);
            max_level=level;
        }

        leftViewTree(node.left,level+1);
        leftViewTree(node.right,level+1);

    }


    public void leftView()
    {
        leftViewTree(root,1);
    }



}
