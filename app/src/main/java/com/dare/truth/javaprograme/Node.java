package com.dare.truth.javaprograme;

/**
 * Created by User on 5/2/2017.
 */
public class Node
{
    int data;
    Node left, right,next;

    public Node(int item)
    {
        data = item;
        left = right = next=null;
    }
}
